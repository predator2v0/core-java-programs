package inheritance;

import java.util.Scanner;

//demonstration of hierarchial inheritance
class HierarchialChildTwo extends HierarchialParent {
	void displaySub() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = s.nextInt();
		System.out.println("Enter the second number: ");
		int b = s.nextInt();
		sub(a, b);
	}
}
