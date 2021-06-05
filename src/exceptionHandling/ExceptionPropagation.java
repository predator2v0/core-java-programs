package exceptionHandling;

import java.io.IOException;

public class ExceptionPropagation {
	public static void main(String[] args) {
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.method3();
		ep.method6();
	}

	// in case of Unchecked Exception, the propagation(forwarding) occurs
	// automatically.
//    below is the example
	void method1() {
		throw new RuntimeException();
	}

	void method2() {
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("EXCEPTION:" + e);
		}
	}

	// in case of Checked Exception, the propagation(forwarding) doesn't occur
	// automatically.
//    every method in the call chain must throw the same exception to propagate it upto the handler.
//    below is the example.
	void method4() throws IOException {
		throw new IOException();
	}

	void method5() throws IOException {
		method4();
	}

	void method6() {
		try {
			method5();
		} catch (Exception e) {
			System.out.println("EXCEPTION: " + e);
		}
	}
}
