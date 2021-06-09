package inheritance;

import java.util.Scanner;

//demonstration of multilevel inheritance
class Multiparent {
	int a;

	void display() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number: ");
		a = s.nextInt();
		System.out.println("a:" + a);
	}
}
