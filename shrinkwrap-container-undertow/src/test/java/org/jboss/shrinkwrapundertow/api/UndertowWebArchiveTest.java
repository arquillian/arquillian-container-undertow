package org.jboss.shrinkwrapundertow.api;

import static io.undertow.servlet.Servlets.deployment;
import static io.undertow.servlet.Servlets.servlet;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import io.undertow.servlet.api.DeploymentInfo;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.undertow.api.UndertowWebArchive;
import org.junit.Test;

public class UndertowWebArchiveTest {

	
	@Test
	public void servletClassShouldBeBuildUsingShrinkWrap() {
		
		DeploymentInfo deployment = deployment()
				.setContextPath("/myapp")
				.setDeploymentName("test.war")
				.setClassLoader(
						UndertowWebArchiveTest.class
								.getClassLoader())
				.addServlet(
						servlet("MessageServlet", MyServlet.class)
								.addInitParam("message", "Hello World")
								.addMapping("/"));
		UndertowWebArchive servletArchive = ShrinkWrap.create(UndertowWebArchive.class).from(
				deployment);
		
		
		assertThat(servletArchive.getDeploymentInfo(), is(deployment));
		
	}
	
}
