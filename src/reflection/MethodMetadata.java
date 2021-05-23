package reflection;

import java.lang.reflect.Method;

public class MethodMetadata {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class methods = Class.forName("reflection.ReflectionStudent");
		
		Method []method = methods.getDeclaredMethods();
		for(Method m: method) {
			System.out.println(m.getDefaultValue()+" "+m.getModifiers()+" "+m.getName()+" "+m.getParameterCount()+" "+m.getReturnType());
		}
	}

}
