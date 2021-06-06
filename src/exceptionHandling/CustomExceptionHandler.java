package exceptionHandling;

import java.util.Scanner;

// throw, throws and finally demo.
class CustomExceptionHandler {
	int id;
	String name;

	public void getId() throws ArithmeticException, NoSuchFieldException {
		System.out.println("enter the id:");
		Scanner sc1 = new Scanner(System.in);
		this.id = sc1.nextInt();
	}

	public void getName() {
		System.out.println("enter a name: ");
		Scanner s1 = new Scanner(System.in);
		try {
			// this.name = s.nextLine();
			throw new Exception("8.no input");
		} catch (Exception e) {
			System.out.println("8.Exception: " + e);
		}
	}
}