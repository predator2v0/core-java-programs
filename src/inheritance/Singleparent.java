package inheritance;

import java.util.Scanner;

//demonstration of single inheritance
class Singleparent {
	int a, b;

	void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number: ");
		a = s.nextInt();
		System.out.println("enter second number: ");
		b = s.nextInt();
		System.out.println("Result: " + (a + b));
	}
}
