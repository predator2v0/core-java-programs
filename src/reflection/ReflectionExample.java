package reflection;

import java.lang.Class;

public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c =  Class.forName("reflection.ReflectionStudent");
		Class i = Class.forName("reflection.ReflectionInterface");
		System.out.println("c.getName(): "+c.getName());
		System.out.println("i.getName(): "+i.getName());
		
		System.out.println("i.isInterface(): "+i.isInterface());
		int[] ar = new int[5];
		System.out.println("ar.getClass().isArray(): "+ar.getClass().isArray());
		System.out.println("ar.getClass().isPrimitive(): "+ar.getClass().isPrimitive());
		
	}

}

