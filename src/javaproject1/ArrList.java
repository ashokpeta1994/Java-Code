package javaproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Ashok");
		al.add(28);
		al.add("Koyyalagudem");
		al.add(71345);
		al.add(0, "FNB");
		al.add(5, "Peta");
		for (Object e : al) {
			System.out.println(e);
		}

		System.out.println("---------------------------------");

		System.out.println(al.get(2));

		System.out.println("---------------------------------");

		al.remove(4);
		System.out.println(al);

		System.out.println("---------------------------------");

		if (al.contains("Ashok")) {
			System.out.println("Element exists");
		} else {
			System.out.println("Element does not exist");
		}

		System.out.println("---------------------------------");

		Collections.reverse(al);
		System.out.println(al);

		System.out.println("---------------------------------");

		List<Object> li = al.subList(1, 3);
		System.out.println(li);

		System.out.println("---------------------------------");

		Collections.swap(al, 0, 3);
		System.out.println(al);

		System.out.println("---------------------------------");

//		al.clear();
//		System.out.println(al);
//
//		System.out.println("---------------------------------");

		al.trimToSize();
		System.out.println(al);

		System.out.println("---------------------------------");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + " " + al.get(i));
		}

	}

}
