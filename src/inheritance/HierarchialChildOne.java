package inheritance;

import java.util.Scanner;

//demonstration of hierarchial inheritance
class HierarchialChildOne extends HierarchialParent {
	void displaySum() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = s.nextInt();
		System.out.println("Enter the second number: ");
		int b = s.nextInt();
		sum(a, b);
	}
}
