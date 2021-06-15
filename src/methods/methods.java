package methods;

import java.util.Scanner;

public class methods {
	public static void main(String[] args) {
		methods m1 = new methods();
		// non static method call(with object)
		m1.welcomeMethod();
		int num;
		System.out.println("enter the number to calculate factorial: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		// static method call(no object required)
		long fact = calcFactorial(num);
		System.out.println("The factorial is: " + fact + "\n");
		// non static method returning array( calculate factors)
		int n;
		System.out.println("enter the number to find factors: ");
		n = s.nextInt();
		int[] factors = new int[n];
		factors = m1.calcFactor(n);
		for (int i = 0; i < factors.length; ++i) {
			if (factors[i] != 0) {
				System.out.print(factors[i] + "\t");
			}
		}
		System.out.println();
		s.close();
	}
	// non parameterized method without returning value

	void welcomeMethod() {
		System.out.println("hello! welcome to the methods example program!");
		System.out.println("a program by Subhakanta Roul");
	}

	// Parameterized method with returning value
	static long calcFactorial(int m) {
		long factCount = 1;
		while (m > 0) {
			factCount *= m;
			m--;
		}
		return factCount;
	}

	// function returning multiple values
	int[] calcFactor(int n) {
		int j = 0;
		int[] fact = new int[n];
		for (int i = 1; i <= (n / 2); ++i) {
			if (n % i == 0) {
				fact[j] = i;
				j++;
			}
		}
		return fact;
	}
}
