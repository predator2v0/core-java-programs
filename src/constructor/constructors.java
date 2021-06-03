package constructor;

import methods.ObjMethod;

// driver class for the constructor demo.
public class constructors {
	public static void main(String[] args) {
//		calling default constructor.
		constructorDemo cd1 = new constructorDemo();
		cd1.showData();
//		calling parameterized constructors
		constructorDemo cd2 = new constructorDemo(2);
		cd2.showData();
		constructorDemo cd3 = new constructorDemo("parametrised constructor 2");
		cd3.showData();
		constructorDemo cd4 = new constructorDemo(4, "parametrised constructor 3");
		cd4.showData();
//		demo of constructor chaining.
		constructorChain cc = new constructorChain();
		System.out.println("cc.x= " + cc.x + "\tcc.y= " + cc.y);
		/*
		 * private constructors can not be used outside the declaring class hence such
		 * classes can not be instantiated. data members needs to be static for such
		 * classes and are known as utility classes. 
		 * PvtConstructor pv = new PvtConstructor(); //can not create object of class with private constructor.
		 */
//		accessing static data member of the utility class with a private constructor.
		System.out.println(PvtConstructor.val);

//      from ObjMethod.java in package methods;
		ObjMethod om = new ObjMethod();
		om.sayHello();
	}
}
