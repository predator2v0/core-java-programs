package methods;

public class ObjMethod {
    String name;
    int id;

    ObjMethod(String st, int dd) {
        name = st;
        id = dd;
    }
    public ObjMethod() {
    	this.id = 0;
    	this.name = null;
    }

    public void sayHello() {
        System.out.println("hello! Subhakanta here.");
    }
}
