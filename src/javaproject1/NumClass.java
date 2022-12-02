package javaproject1;

public class NumClass {

	public static void main(String[] args) {
		int a = 25, b = 78, c = 87;
		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
		} else if (b > c && b > a) {
			System.out.println(b + " is the largest number");
		} else {
			System.out.println(c + " is the largest number");

		}

		System.out.println("---------------------------------------------");

		int[] arr = { 35, -11, -34, 65, 85, -96 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println("Positive: " + arr[i]);
			} else if (arr[i] < 0) {
				System.out.println("Negative: " + arr[i]);
			}

		}

		System.out.println("---------------------------------------------");

		char e = 'n';
		for (int j = 4; j >= 0; j--) {
			System.out.println(e + " = " + j);
		}
	}

}
