package inheritance;

// driver class for the demonstration of various types of inheritance in java.
public class inheritance {
	public static void main(String[] args) {
		// single inheritance
		System.out.println("single inheritance: ");
		Singleparent sp = new Singleparent();
		sp.add();
		Singlechild sc = new Singlechild();
		sc.multiply();
		sc.add();
		// multilevel inheritance
		System.out.println("multilevel inheritance: ");
		Multiparent mp = new Multiparent();
		mp.display();
		Multiintermediate mi = new Multiintermediate();
		mi.display();
		mi.displaySum();
		Multichild mc = new Multichild();
		mc.display();
		mc.displaySum();
		mc.displayTripleSum();
		// hierarchial inheritance
		System.out.println("hierarchial inheritance: ");
		HierarchialParent hp = new HierarchialParent();
		hp.sum(5, 7);
		hp.sub(7, 5);
		HierarchialChildOne hco = new HierarchialChildOne();
		hco.displaySum();
		HierarchialChildTwo hct = new HierarchialChildTwo();
		hct.displaySub();
	}
}