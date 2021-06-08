package helloWorld;

import java.io.*;

class helloWorld {
//	Static block. will executed first and only for once throughout the program
	static {
		System.out.println("inside static block");
	}
//	initializer block. will be executed before the constructor and every time a object is created as well.
	{
		System.out.println("inside initializer block");
	}
//	Instance data member.
	int h = 5;
//	main method starts
	public static void main(String args[]) {
//		creating object of helloWorld class.(initializer block will be executed)
		helloWorld h = new helloWorld();
		System.out.println(h.h);
		System.out.println("Hello World Program!!");
		System.out.println("Hello Java :)");
//		creating object of helloWorld class.(initializer block will be executed)
		helloWorld k = new helloWorld();
		System.out.println(k.h);
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try {
			k.h = Integer.parseInt(b.readLine());
			System.out.println(k.h);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}