package com.cdp.builderfactory;

public class User {

	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phoneNumber; // optional
	private final String address; // optional

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age; // optional
		private String phoneNumber; // optional
		private String address; // optional

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		// Return the finally consrcuted User object
		public User build() {
			User user = new User(this);
			validateUserObject(user);
			return user;
		}

		private void validateUserObject(User user) {
			// Do some basic validations to check
			// if user object does not break any assumption of system

		}

	}

	public static void main(String[] args) {

		User userOne = new User.UserBuilder("Adarsha", "Lunia").age(12).address("testing").phone("1213").build();
		System.out.println("*********userOne***********");
		System.out.println(userOne);

		User userTwo = new User.UserBuilder("Anjana", "Lunia").age(25).build();
		System.out.println("*********userTwo***********");
		System.out.println(userTwo);

		User userThree = new User.UserBuilder("Aditi", "Lunia").build();
		System.out.println("*********userTwo***********");
		System.out.println(userThree);

	}

}
