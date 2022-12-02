package com.inheritance;

public class CarTest extends KiaSonet {

	public static void main(String[] args) {

		KiaSonet ks = new KiaSonet();
		ks.science();
		ks.physic();
		ks.automot();
		ks.vehic();
		ks.car();
		ks.accelerator();
		ks.brake();
		ks.rearCamera();
		ks.powerStart();

		System.out.println("-----------------------------");

		Cars c = new KiaSonet();
		c.brake();
		c.accelerator();

	}

}
