package org.arquillian.undertow;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static io.undertow.Handlers.path;
import static io.undertow.Handlers.websocket;
import io.undertow.websockets.WebSocketConnectionCallback;
import io.undertow.websockets.core.AbstractReceiveListener;
import io.undertow.websockets.core.BufferedTextMessage;
import io.undertow.websockets.core.WebSocketChannel;
import io.undertow.websockets.core.WebSockets;
import io.undertow.websockets.spi.WebSocketHttpExchange;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.undertow.api.UndertowHttpHandlerArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.websocket.WebSocket;
import com.ning.http.client.websocket.WebSocketTextListener;
import com.ning.http.client.websocket.WebSocketUpgradeHandler;

@RunWith(Arquillian.class)
public class EmbeddedUndertowClientWebSocketContainerTest {

	@Deployment(testable = false)
	public static Archive<JavaArchive> createDeployment() {
		return ShrinkWrap.create(UndertowHttpHandlerArchive.class).from(
				path().addPrefixPath("/myapp",
						websocket(new WebSocketConnectionCallback() {

							@Override
							public void onConnect(
									WebSocketHttpExchange exchange,
									WebSocketChannel channel) {
								channel.getReceiveSetter().set(
										new AbstractReceiveListener() {

											@Override
											protected void onFullTextMessage(
													WebSocketChannel channel,
													BufferedTextMessage message) {
												WebSockets.sendText(
														message.getData(),
														channel, null);
											}
										});
								channel.resumeReceives();
							}
						})));
	}

	@Test
	public void shouldBeAbleToReadFromWebSocket(@ArquillianResource URL url)
			throws InterruptedException, ExecutionException, IOException {

		final CountDownLatch latch = new CountDownLatch(1);
		AsyncHttpClient c = new AsyncHttpClient();

		WebSocket websocket = c
				.prepareGet("ws://"+url.getHost()+":"+url.getPort()+"/myapp")
				.execute(
						new WebSocketUpgradeHandler.Builder()
								.addWebSocketListener(
										new WebSocketTextListener() {

											@Override
											public void onMessage(String message) {
												assertThat(message,is("Hello World"));
												latch.countDown();
											}

											@Override
											public void onOpen(
													WebSocket websocket) {
											}

											@Override
											public void onClose(
													WebSocket websocket) {
											}

											@Override
											public void onError(Throwable t) {
											}

											@Override
											public void onFragment(String arg0,
													boolean arg1) {

											}
										}).build()).get();

		websocket.sendTextMessage("Hello World");
		assertThat(latch.await(5, TimeUnit.SECONDS), is(true));
		c.close();
		
	}

}
