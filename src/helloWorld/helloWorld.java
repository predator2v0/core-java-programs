package helloWorld;

import java.io.*;

class helloWorld {
//	Static block. will executed first and only for once throughout the program
	static {
		System.out.println("inside static block");
	}
//	initializer block. will be executed before the main method and every time a object is created as well.
	{
		System.out.println("inside initializer block");
	}
//	Instance data member.
	int h = 5;

	public static void main(String args[]) {
		helloWorld h = new helloWorld();
		System.out.println(h.h);
		System.out.println("Hello World Program!!");
		System.out.println("Hello Java :)");
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