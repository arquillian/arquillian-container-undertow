package org.jboss.shrinkwrap.undertow.api;

import io.undertow.servlet.api.DeploymentInfo;

import java.io.OutputStream;
import java.util.Collection;
import java.util.Map;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ArchiveEventHandler;
import org.jboss.shrinkwrap.api.ArchiveFormat;
import org.jboss.shrinkwrap.api.ArchivePath;
import org.jboss.shrinkwrap.api.Assignable;
import org.jboss.shrinkwrap.api.Filter;
import org.jboss.shrinkwrap.api.IllegalArchivePathException;
import org.jboss.shrinkwrap.api.Node;
import org.jboss.shrinkwrap.api.asset.Asset;
import org.jboss.shrinkwrap.api.asset.NamedAsset;
import org.jboss.shrinkwrap.api.exporter.StreamExporter;
import org.jboss.shrinkwrap.api.formatter.Formatter;
import org.jboss.shrinkwrap.api.spec.WebArchive;

public class UndertowWebArchiveImpl implements UndertowWebArchive {

	private DeploymentInfo deploymentInfo;
	private Archive<?> archive;
	
	public UndertowWebArchiveImpl(Archive<?> archive) {
		this.archive = archive;
	}
	
	@Override
	public String getName() {
		return this.deploymentInfo.getDeploymentName();
	}

	@Override
	public String getId() {
		return deploymentInfo.getContextPath();
	}

	@Override
	public WebArchive add(Asset asset, ArchivePath target)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive add(Asset asset, ArchivePath target, String name)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive add(Asset asset, String target, String name)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive add(NamedAsset namedAsset)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive add(Asset asset, String target)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive addAsDirectory(String path)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive addAsDirectories(String... paths)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive addAsDirectory(ArchivePath path)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive addAsDirectories(ArchivePath... paths)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive addHandlers(ArchiveEventHandler... handlers) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public Node get(ArchivePath path) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public Node get(String path) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public <X extends Archive<X>> X getAsType(Class<X> type, String path) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public <X extends Archive<X>> X getAsType(Class<X> type, ArchivePath path) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public <X extends Archive<X>> Collection<X> getAsType(Class<X> type,
			Filter<ArchivePath> filter) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public <X extends Archive<X>> X getAsType(Class<X> type, String path,
			ArchiveFormat archiveFormat) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public <X extends Archive<X>> X getAsType(Class<X> type, ArchivePath path,
			ArchiveFormat archiveFormat) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public <X extends Archive<X>> Collection<X> getAsType(Class<X> type,
			Filter<ArchivePath> filter, ArchiveFormat archiveFormat) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public boolean contains(ArchivePath path) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public boolean contains(String path) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public Node delete(ArchivePath path) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public Node delete(String archivePath) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public Map<ArchivePath, Node> getContent() {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public Map<ArchivePath, Node> getContent(Filter<ArchivePath> filter) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive add(Archive<?> archive, ArchivePath path,
			Class<? extends StreamExporter> exporter)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive add(Archive<?> archive, String path,
			Class<? extends StreamExporter> exporter)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive merge(Archive<?> source) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive merge(Archive<?> source, Filter<ArchivePath> filter)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive merge(Archive<?> source, ArchivePath path)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive merge(Archive<?> source, String path)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive merge(Archive<?> source, ArchivePath path,
			Filter<ArchivePath> filter) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive merge(Archive<?> source, String path,
			Filter<ArchivePath> filter) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive move(ArchivePath source, ArchivePath target)
			throws IllegalArgumentException, IllegalArchivePathException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public WebArchive move(String source, String target)
			throws IllegalArgumentException, IllegalArchivePathException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public String toString(boolean verbose) {
		return this.deploymentInfo.toString();
	}

	@Override
	public String toString(Formatter formatter) throws IllegalArgumentException {
		return this.toString(true);
	}

	@Override
	public void writeTo(OutputStream outputStream, Formatter formatter)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public Archive<WebArchive> shallowCopy() {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public <TYPE extends Assignable> TYPE as(Class<TYPE> clazz) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public UndertowWebArchive from(DeploymentInfo deployment) {
		this.deploymentInfo = deployment;
		return this;
	}

	@Override
	public DeploymentInfo getDeploymentInfo() {
		return deploymentInfo;
	}
	
}
