package com.inheritance;

public class UberTest {

	public static void main(String[] args) {

		UberApp ub = new UberApp();

		// UseCase1:
		ub.login("ashokpeta", "ashok123").origin("Vijayawada").destination("Hyderabad").selectCar("Kia Seltos")
				.tripCost(7000).waitTime("7 minutes").confirmBooking().tripDuration("6.5 hours")
				.destinationReached("Hyderabad").tripEnded().payment(7000).logout();

		System.out.println("----------------------------------------------------");

		// UseCase2:
		ub.login("veena", "veena345").origin("Hyderabad").destination("Yerrampeta").selectCar("Suzuki Dzire")
				.tripCost(12000).waitTime("25 minutes").cancelTrip("Expected a shorter wait time").logout();

		System.out.println("----------------------------------------------------");

		// UseCase3:
		ub.login("UserName", "Password").origin("Bangalore").destination("Pune").selectCar("Toyota Innova")
				.tripCost(45000).cancelTrip("Trip cost is too high").logout();
	}

}
