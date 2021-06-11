package interfaces;

// driver class for interface demonstration
public class Interface implements Intf2, Intf1 {
	public static void main(String[] args) {
		Interface itfs = new Interface();
		itfs.show();
		itfs.defaultMethod();
		Intf4.hello();
	}

	@Override
	public void show() {
		System.out.println(Intf1.id);
		System.out.println(Intf2.id);
		System.out.println(Intf4.idd);
		System.out.println(Intf3.id);
		System.out.println(Intf2.m);
	}

}