package constructor;

// class for demonstration of constructor chaining
// constructor chaining can be used for initializing multiple objects with a single constructor call.
public class constructorChain {
	int x, y;

// default constructor of the class.
	constructorChain() {
//		calling single parameterized constructor from default constructor.
		this(5);
		System.out.println("constructior without parameter");
	}

//	declaration of constructor with one parameter.
	constructorChain(int x) {
//		calling constructor with two parameters from constructor with one parameter.
		this(x, 7);
		System.out.println("constructor with single parameter");
	}

//	declaration of constructor with two parameters
	constructorChain(int x, int y) {
		System.out.println("constructor with double parameter");
		System.out.println("x= " + x + "\ty= " + y);
		this.x = x;
		this.y = y;
	}
}
