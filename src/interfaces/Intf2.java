package interfaces;

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
