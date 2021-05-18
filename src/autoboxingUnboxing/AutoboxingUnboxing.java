package autoboxingUnboxing;

import java.util.ArrayList;

public class AutoboxingUnboxing {
	public static void main(String[] args) {
		Integer i = 100; // autoboxing of 100(int value) i.e. converting int to Integer object to store
							// it in Integer variable
		Character c = 'c'; // autoboxing of char value to Character object to store it in Character object
		System.out.println(i);
		System.out.println(c);

		ArrayList<Integer> al = new ArrayList<Integer>();
		// ArrayList accepts Integer objects, hence all int values i.e. 100,200,300,400
		// are autoboxed to Integer object
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		// displayed as Integer Objects
		for (Integer in : al) {
			System.out.print(in + " ");
		}
		System.out.println();
		// Integer Object from ArrayList is assigned to int type variable, so Integer
		// Object is Unboxed to int.
		int alem = al.get(0);
		System.out.println(alem);

		Double d = 101.55;
		// both wrapper objects(Double & Integer) are Unboxed into primitive type i.e.
		// double and int,
		// then added then again Autoboxed into Double type.
		d = d + i;
		System.out.println(d);

		// both the int values are autoboxed into Integer Object as add() method accepts
		// Integer Objects
		int sum = add(i, 20);
		System.out.println(sum);
	}

	static int add(Integer a, Integer b) {
		// the sum after addition is unboxed to int type as method returns int value.
		return a + b;
	}
}
