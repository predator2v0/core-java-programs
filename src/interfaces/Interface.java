package interfaces;

interface Intf1 extends Intf4, Intf5 {
	int id = 5;

	void show();
}

interface Intf2 {
	int id = 9;
	int m = 6;

//    static private methods in java 9 onwards
//	static private void staticPrivateMethod() {
//		System.out.println("inside private static method");
//
//	}

	void show();

	default void defaultMethod() {
		System.out.println("default method inside interface");
		System.out.println("calling private method from default method");
//		privateMethod();
//		staticPrivateMethod();
	}

//    private methods in java 9 onwards
//	private void privateMethod() {
//		System.out.println("private method inside interface");
//		System.out.println("m: " + m);
//	}
}

interface Intf4 {
	int id = 8;

	void show();
}

interface Intf5 {
	int idd = 7;

	static void hello() {
		System.out.println("static method inside interface with body");
		System.out.println("hello from static method.");
	}
}

public class Interface implements Intf2, Intf1 {
	public static void main(String[] args) {
		Interface itfs = new Interface();
		itfs.show();
		itfs.defaultMethod();
		Intf5.hello();
	}

	@Override
	public void show() {
		System.out.println(Intf1.id);
		System.out.println(Intf2.id);
		System.out.println(Intf5.idd);
		System.out.println(Intf4.id);
		System.out.println(Intf2.m);
	}

}