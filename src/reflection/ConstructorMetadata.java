package reflection;

import java.lang.reflect.Constructor;

public class ConstructorMetadata {

	public static void main(String[] args)throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class constructors = Class.forName("reflection.ReflectionStudent");
		
		Constructor<?> []constructor = constructors.getDeclaredConstructors();
		
		for(Constructor<?> c: constructor) {
			System.out.println(c.getModifiers()+" "+c.getName()+" "+c.getParameterCount()+" "+c.getDeclaringClass());
		}
	}

}
