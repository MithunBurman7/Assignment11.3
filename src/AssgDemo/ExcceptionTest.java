package AssgDemo;

import java.util.Scanner;

public class ExcceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcceptionTest e1 = new ExcceptionTest();
		e1.doSomething();

	}

	void doSomething() {
		System.out.println("do more got called");
		doMore();
	}

	void doMore() {
		Scanner in = new Scanner(System.in);// Scanner for input

		System.out.println("Input the numerator: ");
		int num1 = in.nextInt();

		int denominator = 0;

		System.out.println(num1 / denominator);
	}
}
