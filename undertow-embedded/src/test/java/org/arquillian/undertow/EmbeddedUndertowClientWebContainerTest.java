package org.arquillian.undertow;

import static io.undertow.servlet.Servlets.deployment;
import static io.undertow.servlet.Servlets.servlet;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.undertow.api.UndertowWebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class EmbeddedUndertowClientWebContainerTest {

	private static final String SERVLET_MAPPING = "/*";
	
	@Deployment(testable = false)
	public static Archive<WebArchive> createDeployment() {
		return ShrinkWrap.create(UndertowWebArchive.class).from(
				deployment()
						.setContextPath("/myapp")
						.setDeploymentName("test.war")
						.setClassLoader(
								EmbeddedUndertowClientWebContainerTest.class
										.getClassLoader())
						.addServlet(
								servlet("MessageServlet", MessageServlet.class)
										.addInitParam("message", "Hello World")
										.addMapping(SERVLET_MAPPING)));
	}

	@Test
	public void shouldBeAbleToInvokeServletInDeployedWebApp(
			@ArquillianResource URL url) throws Exception {

		String body = readAllAndClose(
	            new URL(url, "myservlet").openStream());
		
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
