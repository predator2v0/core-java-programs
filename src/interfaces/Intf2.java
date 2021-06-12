package interfaces;

/*
 * by default, all the data members of the interface are public static final, and all the methods are public abstract, even if they are not
 * declared so.
 */
interface Intf2 {
//	public static final data members of the interface.
	int id = 9;
	int m = 6;

//    static private methods in java 9 onwards
//	static private void staticPrivateMethod() {
//		System.out.println("inside private static method");
//
//	}

//	public abstract method of the interface

	void show();

//	default method of the interface(java 8 onwards)
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
