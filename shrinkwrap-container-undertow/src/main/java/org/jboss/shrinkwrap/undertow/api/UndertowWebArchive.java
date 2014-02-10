package org.jboss.shrinkwrap.undertow.api;

import io.undertow.servlet.api.DeploymentInfo;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.spec.WebArchive;

public interface UndertowWebArchive extends Archive<WebArchive> {

	UndertowWebArchive from(DeploymentInfo deployment);

	DeploymentInfo getDeploymentInfo();
	
}
