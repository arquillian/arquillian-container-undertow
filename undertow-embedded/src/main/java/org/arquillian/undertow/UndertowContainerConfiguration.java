package org.arquillian.undertow;

import org.jboss.arquillian.container.spi.ConfigurationException;
import org.jboss.arquillian.container.spi.client.container.ContainerConfiguration;

public class UndertowContainerConfiguration implements ContainerConfiguration {

	private String bindAddress = "localhost";

	private int bindHttpPort = 8080;

	public void validate() throws ConfigurationException {

	}

	public String getBindAddress() {
		return bindAddress;
	}

	public void setBindAddress(String bindAddress) {
		this.bindAddress = bindAddress;
	}

	public int getBindHttpPort() {
		return bindHttpPort;
	}

	public void setBindHttpPort(int bindHttpPort) {
		this.bindHttpPort = bindHttpPort;
	}

}
