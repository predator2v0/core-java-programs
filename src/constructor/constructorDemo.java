package constructor;

/*
 *  class for constructor overloading demo constructor overloading, like method overloading, is the declaration of more than one constructors 
 *  with the change in number of parameters and type of parameters.
 *  the desired constructor, which will be called is dependent on the arguments of the calling object and decided by the compiler at the compile
 *  time.
 */

class constructorDemo {
	int id;
	String name;

//  default constructor declaration (constructor without parameters)
	constructorDemo() {
		System.out.println("initialized using default constructor");
		id = 1;
		name = "default constructor";
	}

//  Parameterized constructor declaration (constructors with one or more parameters)
	constructorDemo(int idVal) {
		System.out.println("initialized using parameterised constructor(1 int parameter)");
		id = idVal;
		name = "parametrised constructor 1";
	}

	constructorDemo(String str) {
		System.out.println("initialized using parametrised constructor(1 String parameter)");
		id = 3;
		name = str;
	}

	constructorDemo(int idVal, String str) {
		System.out.println("initialized using parametrised constructor(2 parameters)");
		id = idVal;
		name = str;
	}

	void showData() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
	}
}