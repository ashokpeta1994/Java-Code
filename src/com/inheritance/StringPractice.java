package com.inheritance;

public class StringPractice {

	public static void main(String[] args) {

		String str = "Great responsibility";

		char ch = 'i';

		int index = str.indexOf(ch);

		System.out.println(str.length());

//		System.out.println(str.indexOf('s'));
//
//		System.out.println(str.charAt(1));
//
//		System.out.println(str.indexOf('s', str.indexOf('s') + 1));
//
//		System.out.println(str.indexOf('i'));
//
//		System.out.println(str.indexOf('i', str.indexOf('i') + 1));

		while (index != -1) {
			System.out.println(index);
			index = str.indexOf(ch, index + 1);
		}
		
		StringBuffer sb=new StringBuffer("Ashok Peta is a very good man");
		System.out.println(sb.reverse());

	}

}