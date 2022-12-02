package javaproject1;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapping {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "Ashok");
		hm.put(20, "Peta");
		hm.put(30, "Surya");
		hm.put(40, "Burugupalli");
//		System.out.println(hm.get(10));
//		System.out.println(Arrays.asList(hm));
//		System.out.println(hm);
//		
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " and " + m.getValue());
		}

	}

}
