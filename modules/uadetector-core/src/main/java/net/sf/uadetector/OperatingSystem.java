package net.sf.uadetector;

/**
 * {@code OperatingSystem} is an immutable entity that represents the informations about an operating system like Linux,
 * Mac OS X or Windows.
 * 
 * @author André Rouél
 */
public final class OperatingSystem implements ReadableOperatingSystem {

	public static final OperatingSystem EMPTY = new OperatingSystem("unknown", "unknown", "", "", "");

	private final String family;

	private final String name;

	private final String producer;

	private final String producerUrl;

	private final String url;

	public OperatingSystem(final String family, final String name, final String producer, final String producerUrl,
			final String url) {
		if (producer == null) {
			throw new IllegalArgumentException("Argument 'producer' must not be null");
		}
		if (producerUrl == null) {
			throw new IllegalArgumentException("Argument 'producerUrl' must not be null");
		}
		if (family == null) {
			throw new IllegalArgumentException("Argument 'family' must not be null");
		}
		if (name == null) {
			throw new IllegalArgumentException("Argument 'name' must not be null");
		}
		if (url == null) {
			throw new IllegalArgumentException("Argument 'url' must not be null");
		}

		this.producer = producer;
		this.producerUrl = producerUrl;
		this.family = family;
		this.name = name;
		this.url = url;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final OperatingSystem other = (OperatingSystem) obj;
		if (!family.equals(other.family)) {
			return false;
		}
		if (!name.equals(other.name)) {
			return false;
		}
		if (!producer.equals(other.producer)) {
			return false;
		}
		if (!producerUrl.equals(other.producerUrl)) {
			return false;
		}
		if (!url.equals(other.url)) {
			return false;
		}
		return true;
	}

	@Override
	public String getFamily() {
		return family;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getProducer() {
		return producer;
	}

	@Override
	public String getProducerUrl() {
		return producerUrl;
	}

	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + family.hashCode();
		result = prime * result + name.hashCode();
		result = prime * result + producer.hashCode();
		result = prime * result + producerUrl.hashCode();
		result = prime * result + url.hashCode();
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("OperatingSystem [family=");
		builder.append(family);
		builder.append(", name=");
		builder.append(name);
		builder.append(", producer=");
		builder.append(producer);
		builder.append(", producerUrl=");
		builder.append(producerUrl);
		builder.append(", url=");
		builder.append(url);
		builder.append("]");
		return builder.toString();
	}

}
