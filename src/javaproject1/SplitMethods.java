package javaproject1;

public class SplitMethods {

	public static void main(String[] args) {

		String s = "I am working as a Tester in FNB";
		String[] s1 = s.split(" ");
		for (String e : s1) {
			System.out.println(e);
		}
		System.out.println(s1.length);
	}

}
