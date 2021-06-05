package exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ChainedException {
	public static void main(String[] args) {
		ChainedException ce = new ChainedException();
		System.out.println("enter a and b: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			divide(a, b);
		} catch (Exception ae) {
			System.out.println(ae.getCause());
			System.out.println(ae);
		}
	}

	public static void divide(int a, int b) {
		if (b == 0) {
			ArithmeticException ae = new ArithmeticException();
			ae.initCause(new IOException("cant take 0 as input in division"));
			throw ae;
		} else {
			System.out.println(a / b);
		}
	}
}
