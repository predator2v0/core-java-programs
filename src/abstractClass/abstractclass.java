package abstractClass;

import mypackage.Package;

// non-abstract class extends abstract class.
// it is necessary to define all the abstract method's body by overriding them in the concrete class
public class abstractclass extends abclass {
	public static void main(String[] args) {
		abstractclass ab = new abstractclass();
		Package p = new Package();
		p.welcome();
		ab.abm();
		ab.show();
		ab.sum();
//      abstract class data members are accessed using objects of concrete sub class.
		System.out.println("abstract class data member m =" + ab.m);
		p.bye();
//      objects of abstract classes can not be created but references can be created with concrete subclass.
//      abstraction can be achieved this way.
		abclass abc = new abstractclass();
		abc.abm();
		abc.hello();
	}

//  Overrides all the abstract methods from the parent classes
	@Override
	public void abm() {
		System.out.println("abstract method overriden with a body");
	}

	@Override
	void hello() {
		System.out.println("hello method");
	}
}
