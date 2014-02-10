package org.jboss.shrinkwrapundertow.api;

	import static org.hamcrest.CoreMatchers.is;
	import static org.junit.Assert.assertThat;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.undertow.api.UndertowHttpHandlerArchive;
import org.junit.Test;

public class UndertowHttpHandlerArchiveTest {

	@Test
	public void httpHandlerClassShouldBeBuildUsingShrinkwrap() {
		
		HttpHandler handler = new HttpHandler() {
            @Override
            public void handleRequest(final HttpServerExchange exchange) throws Exception {
                exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
                exchange.getResponseSender().send("Hello World");
            }
        };
		UndertowHttpHandlerArchive httpHandler = ShrinkWrap.create(UndertowHttpHandlerArchive.class).from(handler);
		
		assertThat(httpHandler.getHttpHandler(), is(handler));
		
	}
	
}
