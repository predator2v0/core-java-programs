package classObject;

interface AnonymousIntf {
	void anonymousMethodOne();

	void anonymousMethodTwo();
}

public class NestedClass {
	static int sncv = 1;
	int ncv = 2;
//  creating reference of interface using anonymous class inside a class (Anonymous inner class).
	AnonymousIntf ain = new AnonymousIntf() {
//    	Overriding and defining abstract methods of the interfaces inside the anonymous class.
		@Override
		public void anonymousMethodOne() {
			System.out.println("inside Anonymous Method One\n overridden from anonymous interface abstract method.");
		}

		@Override
		public void anonymousMethodTwo() {
			System.out.println("inside anonymous interface two\n overriding the abstract method");
		}
	};
	private int pin = 3;

//	main() method starts.
	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
//		instantiation of the nested inner class using object of outer class.
		NestedClass.NestedInnerOne nio = nc.new NestedInnerOne();
		System.out.println(nio.idk);
		nc.instantiateInnerClassTwo();
		StaticNestedClass snc = new StaticNestedClass();
		System.out.println(snc.st);
		System.out.println(NestedClass.StaticNestedClass.stn);
		snc.staticNestedClassMethod();
		nio.NestedInnerOneSum();
		System.out.println(nio.niopin++);
		OuterSecondClass osc = new OuterSecondClass();
		osc.DisplayOuterSecondClass();
		localInnerMethod();

	}

	static void localInnerMethod() {
//		inner class inside method i.e. local inner class.
		class LocalInnerClass {
			int lic = 7;

			public void showLicVal() {
				System.out.println(lic);
			}
		}
		LocalInnerClass licl = new LocalInnerClass();
		licl.showLicVal();
	}

	public void instantiateInnerClassTwo() {
		NestedClassTwo nct = new NestedClassTwo();
		System.out.println(nct.nm);
		ain.anonymousMethodOne();
		ain.anonymousMethodTwo();
	}

//	static inner class
	static class StaticNestedClass {
		static String stn = "Static Nested Class String";
		int st = 5;

		void staticNestedClassMethod() {
//            System.out.println(ncv); // static class cannot refer to non static member of outer(enclosing) class.
			System.out.println(sncv);
		}
	}

//	member inner class.
	class NestedInnerOne {
		int idk = 4;
		private int niopin = 6;

		public void NestedInnerOneSum() {
			System.out.println(idk + pin);
		}
	}

//	member inner class.
	class NestedClassTwo {
		String nm = "Subhakanta Roul";

	}
}

// outer class i.e. class declared outside the class(normal concrete class)
// to access inner class members from here, first create object of the outer class, then create object of inner class using outer class.
class OuterSecondClass {
	NestedClass ncc = new NestedClass();
	NestedClass.NestedInnerOne ncnio = ncc.new NestedInnerOne();

	void DisplayOuterSecondClass() {
		ncnio.NestedInnerOneSum();
	}
}