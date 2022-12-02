package javaproject1;

public class DataConversion {

	public static void main(String[] args) {

		String s = "100A";
		String s1 = s.replace('A', ' ').trim();
		int i = Integer.parseInt(s1);
		System.out.println(i / 5);

	}

}
