package org.jboss.shrinkwrap.undertow.api;

import io.undertow.server.HttpHandler;

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
import org.jboss.shrinkwrap.api.spec.JavaArchive;

public class UndertowHttpHandlerArchiveImpl implements UndertowHttpHandlerArchive {

	private HttpHandler handle;
	
	private Archive<?> archive;
	
	public UndertowHttpHandlerArchiveImpl(Archive<?> archive) {
		this.archive = archive;
	}
	
	@Override
	public <TYPE extends Assignable> TYPE as(Class<TYPE> clazz) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public String getName() {
		return handle.getClass().getName();
	}

	@Override
	public String getId() {
		return handle.getClass().getName();
	}

	@Override
	public JavaArchive add(Asset asset, ArchivePath target)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive add(Asset asset, ArchivePath target, String name)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive add(Asset asset, String target, String name)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive add(NamedAsset namedAsset)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive add(Asset asset, String target)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive addAsDirectory(String path)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive addAsDirectories(String... paths)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive addAsDirectory(ArchivePath path)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive addAsDirectories(ArchivePath... paths)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive addHandlers(ArchiveEventHandler... handlers) {
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
	public JavaArchive add(Archive<?> archive, ArchivePath path,
			Class<? extends StreamExporter> exporter)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive add(Archive<?> archive, String path,
			Class<? extends StreamExporter> exporter)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive merge(Archive<?> source) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive merge(Archive<?> source, Filter<ArchivePath> filter)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive merge(Archive<?> source, ArchivePath path)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive merge(Archive<?> source, String path)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive merge(Archive<?> source, ArchivePath path,
			Filter<ArchivePath> filter) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive merge(Archive<?> source, String path,
			Filter<ArchivePath> filter) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive move(ArchivePath source, ArchivePath target)
			throws IllegalArgumentException, IllegalArchivePathException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public JavaArchive move(String source, String target)
			throws IllegalArgumentException, IllegalArchivePathException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public String toString(boolean verbose) {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public String toString(Formatter formatter) throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public void writeTo(OutputStream outputStream, Formatter formatter)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public Archive<JavaArchive> shallowCopy() {
		throw new UnsupportedOperationException("Operation not supported for Undertow Archive.");
	}

	@Override
	public UndertowHttpHandlerArchive from(HttpHandler handler) {
		this.handle = handler;
		return this;
	}

	@Override
	public HttpHandler getHttpHandler() {
		return this.handle;
	}
	
}
