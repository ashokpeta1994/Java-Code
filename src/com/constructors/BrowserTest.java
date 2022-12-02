package com.constructors;

import java.util.Arrays;

public class BrowserTest {

	public static void main(String[] args) {

		Browser br = new Browser("Chrome", "Google", 98.005, Arrays.asList("Adobe", "Speed", "Downloads"));

		System.out.println(
				br.getBrowserName() + " " + br.getCurrentVersion() + " " + br.getVendorName() + " " + br.getPl());

		br.setBrowserName("Firefox");
		br.setCurrentVersion(123.5689);

		System.out.println(
				br.getBrowserName() + " " + br.getCurrentVersion() + " " + br.getVendorName() + " " + br.getPl());

	}

}
