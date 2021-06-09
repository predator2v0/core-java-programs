package inheritance;

import java.util.Scanner;

public class inheritance {
	public static void main(String[] args) {
		// single inheritance
		Singleparent sp = new Singleparent();
		System.out.println("single inheritance: ");
		sp.add();
		Singlechild sc = new Singlechild();
		sc.multiply();
		sc.add();
		// multilevel inheritance
		System.out.println("multilevel inheritance: ");
		Multiparent mp = new Multiparent();
		mp.display();
		Multiintermediate mi = new Multiintermediate();
		mi.display();
		mi.displaySum();
		Multichild mc = new Multichild();
		mc.display();
		mc.displaySum();
		mc.displayTripleSum();
		// heirarchial inheritance
		System.out.println("heirarchial inheritance: ");
		HeirarchialParent hp = new HeirarchialParent();
		hp.sum(5, 7);
		hp.sub(7, 5);
		HeirarchialChildOne hco = new HeirarchialChildOne();
		hco.displaySum();
		HeirarchialChildTwo hct = new HeirarchialChildTwo();
		hct.displaySub();
	}
}

// start code refactoring from here.
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

// hirarchial inheritance
class HeirarchialParent {
	void sum(int a, int b) {
		System.out.println("sum: " + (a + b));
	}

	void sub(int x, int y) {
		System.out.println("Difference: " + (x - y));
	}
}

class HeirarchialChildOne extends HeirarchialParent {
	void displaySum() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = s.nextInt();
		System.out.println("Enter the second number: ");
		int b = s.nextInt();
		sum(a, b);
	}
}

class HeirarchialChildTwo extends HeirarchialParent {
	void displaySub() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = s.nextInt();
		System.out.println("Enter the second number: ");
		int b = s.nextInt();
		sub(a, b);
	}
}