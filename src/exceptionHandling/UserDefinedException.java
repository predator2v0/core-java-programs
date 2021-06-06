package exceptionHandling;

import java.util.Scanner;

public class UserDefinedException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = s.nextInt();
		for (int i = num; i > 0; i--) {
			try {
				if (i == 1) {
//					throwing the custom exception created by the user.
					throw new MyCustomException("cannot divide by 1 :)");
				}
				System.out.println(num / i);
//			handling the custom user defined exception in the catch block.
			} catch (MyCustomException me) {
				System.out.println(me);
			}
		}
		try {
			myMethod();
//		handling the custom user defined exception in the catch block.
		} catch (MyCustomException m) {
			System.out.println(m);
		}
	}
//	throwing the custom exception by the method using throws keyword.
	public static void myMethod() throws MyCustomException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			System.out.println(num / i);
		}
	}
}
