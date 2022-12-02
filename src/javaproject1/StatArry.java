package javaproject1;

import java.util.ArrayList;

public class StatArry {

	public static void main(String[] args) {

		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add("Sachin");
		a1.add(45);
		a1.add("India");
		a1.add("24-April-1977");
		a1.add('M');
		a1.add(125.33);
		a1.add(false);
		for (Object al : a1) {
			System.out.println(al);

		}
		System.out.println("---------------------------------");

		ArrayList<Object> a2 = new ArrayList<Object>();
		a2.add("Sehwag");
		a2.add(43);
		a2.add("India");
		a2.add("24-April-1979");
		a2.add('M');
		a2.add(152.33);
		a2.add(false);
		for (Object all : a2) {
			System.out.println(all);

		}

	}
}
