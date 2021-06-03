package constructor;

/*
 * class for private constructor demo
 
 * classes with private constructor cannot be instantiated outside the class and hence can not be used to initialize objects outside the
 * declaring class.
 * such classes needs to make all their data members as static and are called utility classes.
 */
class PvtConstructor {
	static int val = 2890;

	private PvtConstructor() {
	}
}
