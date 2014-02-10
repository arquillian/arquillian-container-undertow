package org.jboss.shrinkwrap.undertow.api;

import io.undertow.server.HttpHandler;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

public interface UndertowHttpHandlerArchive extends Archive<JavaArchive> {

	public UndertowHttpHandlerArchive from(HttpHandler handler);

	public HttpHandler getHttpHandler();
	
}
