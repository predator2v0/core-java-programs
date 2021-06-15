package methods;

import java.util.Scanner;

public class MethodOverloading {
	public static void main(String[] args) {
		int a, b, c, d, i;
		String st;
		// main method overloading
		MethodOverloading.main();
		Scanner s = new Scanner(System.in);
		System.out.println("enter 5 integer values: ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		i = s.nextInt();
//		consuming the newline using nextLine(), so that the next newLine() method will work without any error.
		s.nextLine();
		System.out.println("enter a string value: ");
		st = s.nextLine();
		// overloading by changing number of parameters
		MethodOverloading mo = new MethodOverloading();
		// System.out.println("function with no argument: ");
		mo.add();
		// System.out.println("function with two arguments:");
		mo.add(a, b);
		// System.out.println("function with three arguments: ");
		mo.add(a, b, c);
		// System.out.println("function with automatic type promotion(4args): ");
		mo.add(a, b, c, d);
		// overloading with changing parameters
		// System.out.println("function with different parameters: ");
		mo.add(st, i);
		// System.out.println("function with interchanging parameters: ");
		mo.add(i, st);

		s.close();
	}

	// method with no parameters
	void add() {
		int a = 5, b = 7;
		System.out.println("function without parameter");
		System.out.println("result: " + (a + b));
	}

	// method with parameters
	void add(int a, int b) {
		System.out.println("function with two similar parameter");
		System.out.println("result: " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("function with three similar parameter");
		System.out.println("result: " + (a + b + c));
	}

	// method with upgradable parameter types
	void add(int a, long b, int c, long d) {
		System.out.println("function with four upgradable parameter(automatic type conversion)");
		System.out.println("result: " + (a + b + c + d));
	}

	// method with different types of parameters
	void add(String st, int i) {
		System.out.println("function with two different parameter");
		System.out.println("result: " + (st + i));
	}

	// method with interchanging parameters types
	void add(int i, String st) {
		System.out.println("function with two different parameters interchanged");
		System.out.println("result: " + (i + st));
	}

	// overloading the main method
	public static void main() {
		System.out.println("hello world!!\n int main in java!!");
	}
}
