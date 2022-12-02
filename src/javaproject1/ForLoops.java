package javaproject1;

public class ForLoops {

	public static void main(String[] args) {

		int k = 2;
		for (int i = 1; i <= 20; i++) {
			System.out.println(k * i);

		}

		System.out.println("-----------------");

		int p = 10;
		int q = 1;
		for (int j = 1; j <= p; j++) {
			q = q * j;
		}
		System.out.println(q);

		System.out.println("-----------------");

		String s = "I am Batman";
		int x = 6;
		for (int a = 1; a <= 1; a++) {
			for (int c = 1; c <= x; c++) {
				System.out.println(s + " " + c);
			}
		}

		System.out.println("-----------------");

		for (int m = 0; m < 8; m++) {
			for (int n = 0; n < 8; n++) {
				System.out.print(m + "" + n + " ");
			}
			System.out.println();
		}

	}

}
