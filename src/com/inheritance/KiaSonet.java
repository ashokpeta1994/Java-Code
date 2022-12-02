package com.inheritance;

public class KiaSonet extends Cars {
	
	@Override
	public void brake() {
		System.out.println("Kia - Brakes");
	}

	public void rearCamera() {
		System.out.println("Kia - Rear Camera");
	}

	public void powerStart() {
		System.out.println("Kia - Power Start");
	}

}
