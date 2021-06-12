package interfaces;

/*
 * by default, all the data members of the interface are public static final, and all the methods are public abstract, even if they are not
 * declared so.
 */
interface Intf1 extends Intf3, Intf4 {
//	public static data member of the interface
	int id = 5;

//	public abstract method of the interface
	void show();
}
