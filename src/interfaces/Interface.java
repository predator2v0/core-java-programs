package interfaces;

// driver class for interface demonstration
// class implementing multiple interfaces.
public class Interface implements Intf2, Intf1 {
	public static void main(String[] args) {
		Interface itfs = new Interface();
//		invoking the overridden method of interfaces in the child class using the object of child class.
		itfs.show();
//		invoking the default method(java 8 onwards)
		itfs.defaultMethod();
//		invoking the static method using the interface name. (java 8 onwards)
		Intf4.hello();
	}

//  Overriding the abstract method of the interfaces in the inheriting concrete class.
	@Override
	public void show() {
		System.out.println(Intf1.id);
		System.out.println(Intf2.id);
		System.out.println(Intf4.idd);
		System.out.println(Intf3.id);
		System.out.println(Intf2.m);
	}

}