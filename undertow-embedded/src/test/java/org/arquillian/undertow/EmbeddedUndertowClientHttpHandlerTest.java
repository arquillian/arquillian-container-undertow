package org.arquillian.undertow;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.undertow.api.UndertowHttpHandlerArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class EmbeddedUndertowClientHttpHandlerTest {

    @Deployment(testable = false)
    public static Archive<JavaArchive> createDeployment() {
        return ShrinkWrap.create(UndertowHttpHandlerArchive.class).from(new HttpHandler() {
            @Override
            public void handleRequest(final HttpServerExchange exchange) throws Exception {
                exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
                exchange.getResponseSender().send("Hello World");
            }
        });
    }

    @Test
    public void shouldBeAbleToInvokeHandlers(@ArquillianResource URL url) throws Exception {

        String body = readAllAndClose(
            url.openStream());

        assertThat(body, is("Hello World"));
    }

    private String readAllAndClose(InputStream is) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            int read;
            while ((read = is.read()) != -1) {
                out.write(read);
            }
        } finally {
            try {
                is.close();
            } catch (Exception e) {
            }
        }
        return out.toString();
    }
}
