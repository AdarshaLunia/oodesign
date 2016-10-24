package com.cdp.factory_two;

public class DogFactory {

	public static Dog getDog(String criteria) {
		if (criteria.equals("small"))
			return new HomeDog();
		else if (criteria.equals("big"))
			return new NeighbourDog();
		else if (criteria.equals("awesome"))
			return new StreetDog();
		return null;
	}

}
