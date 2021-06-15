package methods;

public class MethodOverriding {
	public static void main(String[] args) {
		parent p = new parent();
		p.getInfo();
		child c = new child();
		c.getInfo();
		System.out.println("calling both simultaneously:");
		c.showInfo();
		parent pa = p.human();
		child ch = c.human();
		parent pc = new child();
		pc.getInfo();
		System.out.println(pc.i);
		System.out.println(pc.j);
		pc.getInfo();
		pc.parentInfo();
//        pc.childInfo();
		p = c;
		p.parentInfo();
		p.human();
	}
}

// parent class
class parent {
	int i = 2;
	int j = 3;

	public void getInfo() {
		System.out.println("parent information:");
		System.out.println("parent class is the superclass");
	}

	parent human() {
		System.out.println("inside parent");
		return new parent();
	}

	public void parentInfo() {
		System.out.println("hello, this is parent!");
	}

}

// child class in which methods of parent class are overridden
class child extends parent {
	int i = 1;

	@Override
	public void getInfo() {
		System.out.println("child information: ");
		System.out.println("child class is the subclass");
	}

	void showInfo() {
		super.getInfo();
		getInfo();
	}

	@Override
	child human() {
		System.out.println("inside child");
		return new child();
	}

	public void childInfo() {
		System.out.println("Hello, this is child!!");
	}
}