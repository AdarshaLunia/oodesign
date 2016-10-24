package com.cdp.prototype;

import com.cdp.prototype.PrototypeFactory.ModelType;

public class TestPrototypePattern {

	public static void main(String a[]) {

		try {
			String movieProtoType = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
			System.out.println(movieProtoType);
			String albumProtoType = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
			System.out.println(albumProtoType);
			String tvShowProtoType = PrototypeFactory.getInstance(ModelType.TVSHOW).toString();
			System.out.println(tvShowProtoType);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
