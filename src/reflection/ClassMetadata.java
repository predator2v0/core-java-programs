package reflection;

public class ClassMetadata {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class classes = Class.forName("reflection.ReflectionStudent");
		System.out.println("name: " + classes.getName());
		System.out.println("type name: " + classes.getTypeName());
		System.out.println("package name: " + classes.getPackage());
		System.out.println("number of modifiers: " + classes.getModifiers());
	}

}
