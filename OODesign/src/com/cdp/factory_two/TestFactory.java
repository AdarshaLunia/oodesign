package com.cdp.factory_two;

public class TestFactory {

	public static void main(String a[]) {
		Dog dog = DogFactory.getDog("small");
		dog.speak();
		dog = DogFactory.getDog("big");
		dog.speak();
		dog = DogFactory.getDog("awesome");
		dog.speak();

	}

}


/*   A simple factory like this returns an instance of any one of several 
possible classes that have a common parent class.

  In “Factory” class, which in this case is a DogFactory class. As you can see from the code below, 
the DogFactory class has a static getDog method that returns a Dog that depends on the criteria that 
has been supplied.*/