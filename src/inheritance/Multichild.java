package inheritance;

import java.util.Scanner;

//demonstration of multilevel inheritance
class Multichild extends Multiintermediate {
	int b;

	void displayTripleSum() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter child class number: ");
		b = s.nextInt();
		System.out.println("enter intermediate class number: ");
		super.b = s.nextInt();
		System.out.println("enter the parent class number: ");
		a = s.nextInt();
		System.out.println(
				"child: " + b + "\t intermediate: " + super.b + "\t parent: " + a + "\n sum: " + (a + super.b + b));
	}
}
