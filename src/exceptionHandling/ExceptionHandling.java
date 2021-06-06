package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling extends CustomExceptionHandler {
	public static void main(String[] args) throws Exception {
		int a = 0;
//        try block with multiple catch blocks
		try {
			int b = 7 / a;
			System.out.println(b);
		} catch (ArithmeticException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("1. arithmetic exception");
			} else {
				System.out.println("1. any other exception");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//        nested try blocks.
		try {
			System.out.println("welcome to the exception program");
			try {
				int[] ar = new int[2];
				System.out.println(ar[2]);
			} catch (ArithmeticException e) {
				System.out.println("3. ArrayIndexOutOfBound");
			}
		} catch (Exception ee) {
			System.out.println("4. hello exception");
		}
//        try block with resources
		// Java 7 onwards supports declaration of resource inside try
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number");
			int number = sc.nextInt();
			number = number / 0;
		} catch (Exception e) {
			System.out.println("5. Exception:" + e);
		}
		// java 9 onwards supports resource declaration outside of the try();
//		Scanner s = new Scanner(System.in);
//        try (s) {	/* java 9 onwards*/
//		try {
//			System.out.println("enter a String:");
//			String name = s.nextLine();
//			System.out.println(name);
//		} catch (Exception e) {
//			System.out.println("6. Exception: " + e);
//		}
		CustomExceptionHandler ceh = new CustomExceptionHandler();
		try {
			ceh.getId();
		} catch (Exception e) {
			System.out.println("7. Exception: " + e);
		}
		try {
			ceh.getName();
		} catch (Exception e) {
			System.out.println("8.2. exception: " + e);
		} finally {
			System.out.println("9. finally blcok getting executed.");
			ExceptionHandling eh = new ExceptionHandling();
			System.out.println(eh instanceof CustomExceptionHandler);
			System.out.println(ceh instanceof ExceptionHandling);
		}
//		s.close();
	}
}
