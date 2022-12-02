package com.constructors;

import java.util.Arrays;

public class UniversityTest {

	public static void main(String[] args) {

		University un = new University("Ashok", "India", "08/06/1994");
		System.out.println(un.name + " " + un.country + " " + un.establishedDate);

		un.setCountry("South Africa");
		System.out.println(un.getCountry());

		University un1 = new University("Bannu", "India", "03/08/1996", Arrays.asList("Maths", "Physics"));
		System.out.println(un1.getName());
		System.out.println(un1.getCountry());
		System.out.println(un1.getEstablishedDate());
		System.out.println(un1.getCourse());

		System.out.println(un1.course);

		un1.setCourse(Arrays.asList("Java", "Python", "C#"));
		System.out.println(un1.getCourse());

	}

}
