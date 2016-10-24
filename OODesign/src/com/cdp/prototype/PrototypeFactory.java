package com.cdp.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	public static class ModelType {

		public static final String MOVIE = "movie";

		public static final String ALBUM = "album";

		public static final String TVSHOW = "tvShow";

	}

	private static Map<String, PrototypeCapable> protoTypes = new HashMap<>();
	static {

		protoTypes.put(ModelType.ALBUM, new Album());

		protoTypes.put(ModelType.MOVIE, new Movie());

		protoTypes.put(ModelType.TVSHOW, new TVShow());
	}

	public static PrototypeCapable getInstance(final String a) throws CloneNotSupportedException {
		return protoTypes.get(a).clone();

	}
}
