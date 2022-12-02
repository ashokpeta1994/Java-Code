package javaproject1;

public class WhileLoops {

	public static void main(String[] args) {

		int a = 10;
		int b = 1;
		while (b <= 20) {
			System.out.println(b * a);
			b++;

		}

		int c = 10;
		while (c > 0) {
			System.out.println(c);
			c--;

		}

		int d = 1;
		while (d <= 10) {
			System.out.println("Hello World");
			d++;
		}

		int e = 1;
		while (e <= 10) {
			System.out.println(e);
			e++;
			if (e % 7 == 0) {
				break;
			}
		}

	}

}