package interfaces;

interface Intf4 {
	int idd = 7;

	static void hello() {
		System.out.println("static method inside interface with body");
		System.out.println("hello from static method.");
	}
}
