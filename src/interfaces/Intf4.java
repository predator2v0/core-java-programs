package interfaces;

/*
 * by default, all the data members of the interface are public static final, and all the methods are public abstract, even if they are not
 * declared so.
 */
interface Intf4 {
//	public static final data members of the interface.
	int idd = 7;

//	static methods of the interface(java 8 onwards)
	static void hello() {
		System.out.println("static method inside interface with body");
		System.out.println("hello from static method.");
	}
}
