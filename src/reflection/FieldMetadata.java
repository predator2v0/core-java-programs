package reflection;

import java.lang.reflect.Field;

public class FieldMetadata {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class fields = Class.forName("reflection.ReflectionStudent");
		Field []field = fields.getDeclaredFields();
		
		for(Field f: field) {
			System.out.println(f.getType()+"\t "+f.getName()+"\t "+f.getModifiers());
		}
	}

}
