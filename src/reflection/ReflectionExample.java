package reflection;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import jdk.nashorn.internal.ir.ForNode;

public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException,SecurityException {
		Class c =  Class.forName("reflection.ReflectionStudent");
		Class i = Class.forName("reflection.ReflectionInterface");
		System.out.println("c.getName(): "+c.getName());
		System.out.println("i.getName(): "+i.getName());
		
		System.out.println("i.isInterface(): "+i.isInterface());
		int[] ar = new int[5];
		System.out.println("ar.getClass().isArray(): "+ar.getClass().isArray());
		System.out.println("ar.getClass().isPrimitive(): "+ar.getClass().isPrimitive());
		System.out.println("c.getSuperClass(): "+c.getSuperclass());
		
		Field[] cFields = c.getDeclaredFields();
		System.out.println("all declared fields in thestudent class: "+Arrays.toString(cFields));
		
		Method[] cMethods = c.getDeclaredMethods();
		System.out.println("all declared methods in the student class: "+Arrays.toString(cMethods));
		
		Constructor<?> []cConstructors = c.getDeclaredConstructors();
		System.out.println("all declared Constructors are: "+Arrays.toString(cConstructors));
		
		Field []clF = c.getFields();
		System.out.println("all public fields from specified class and its super class: "+Arrays.toString(clF));
		
		Method []clM = c.getMethods();
		System.out.println("all public methods from specified class and its super class: "+Arrays.toString(clM));
		
		Constructor<?> []clC = c.getConstructors();
		System.out.println("all public constructors from specified class and its super class: "+Arrays.toString(clC));
		
		System.out.println("c.getMethod(\"display\",null): "+c.getMethod("display",null));
		
		ReflectionStudent rs = new ReflectionStudent(102,"carter",45.0);		
		System.out.println(rs.getClass());
		
		Class name = ReflectionStudent.class;
		System.out.println(name);
		
		Class x = Class.forName("java.lang.String");
		System.out.println(x.getName());
	}

}

