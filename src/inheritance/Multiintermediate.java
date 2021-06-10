package inheritance;

import java.util.Scanner;

//demonstration of multilevel inheritance
class Multiintermediate extends Multiparent {
	int b;

	void displaySum() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter child class number: ");
		b = s.nextInt();
		System.out.println("enter parent class number: ");
		a = s.nextInt();
		System.out.println("child a: " + b + "\t parent a: " + a + "\t sum: " + (b + a));
	}
}
