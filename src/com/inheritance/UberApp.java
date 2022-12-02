package com.inheritance;

public class UberApp {

	public UberApp login(String un, String pwd) {
		System.out.println("The login credentials are:" + un + " and " + pwd);
		return this;
	}

	public UberApp origin(String origin) {
		System.out.println("The origin is: " + origin);
		return this;
	}

	public UberApp destination(String destination) {
		System.out.println("The destination is: " + destination);
		return this;
	}

	public UberApp selectCar(String car) {
		System.out.println("The desired car is: " + car);
		return this;
	}

	public UberApp tripCost(int cost) {
		System.out.println("Estimated cost of the trip is: ₹" + cost);
		return this;
	}

	public UberApp waitTime(String time) {
		System.out.println("The wait time for the selected car is: " + time);
		return this;
	}

	public UberApp confirmBooking() {
		System.out.println("The booking has been confirmed");
		return this;
	}

	public UberApp cancelTrip(String reason) {
		System.out.println("The trip has been cancelled because: " + reason);
		return this;
	}

	public UberApp tripDuration(String duration) {
		System.out.println("The total duration of the trip is: " + duration);
		return this;
	}

	public UberApp destinationReached(String destination) {
		System.out.println("The destination " + destination + " has reached");
		return this;
	}

	public UberApp tripEnded() {
		System.out.println("The trip has ended");
		return this;
	}

	public UberApp payment(int cost) {
		System.out.println("Please make the payment of: ₹" + cost);
		return this;
	}

	public UberApp logout() {
		System.out.println("The user has logged out successfully from the app");
		return this;
	}
}
