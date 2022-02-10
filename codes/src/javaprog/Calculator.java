package javaprog;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Calculate {

	private int a;
	private int b;

	public Calculate(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public int mmulti() {
		return a * b;
	}

	public float div() {
		float f = (float) a / b;
		return f;
	}
}

public class Calculator {
	public static void main(String[] args) {

		long start = System.nanoTime();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the two numbers to perform any of the arthematic actions.");
			System.out.print("\n");
			int x = sc.nextInt();
			int y = sc.nextInt();
			Calculate c = new Calculate(x, y);
			System.out.println(
					"Enter your choice | 1 ----> addition | 2 ----> subtraction | 3 ----> multipplication | 4 ----> division | 5 to Exit");
			int z = sc.nextInt();
			System.out.print("\n");
			while (z <= 4) {
				switch (z) {
				case 1:
					System.out.println("Answer is  " + c.add());
					break;

				case 2:
					System.out.println("Answer is  " + c.sub());
					break;

				case 3:
					System.out.println("Answer is  " + c.mmulti());
					break;

				case 4:
					System.out.println("Answer is  " + c.div());
					break;

				default:
					System.out.println("Invalid entry ------->");
				}
				System.out.println(
						"Enter your choice | 1 ----> addition | 2 ----> subtraction | 3 ----> multipplication | 4 ----> division..");
				z = sc.nextInt();

			}
		}

		long end = System.nanoTime();
		long elapse = end - start;

		System.out.println("Elapsed time to execute  = " + elapse);
		System.out.println("Time in Seconds" + TimeUnit.SECONDS.convert(elapse, TimeUnit.NANOSECONDS));

	}

}

