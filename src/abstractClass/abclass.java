package abstractClass;

// an abstract class inheriting another abstract class.
// abstract class is a class declared with the abstract keyword.
// it can hold both abstract as well as non-abstract(concrete) methods.
abstract class abclass extends baclass {
    int m = 5, n;
    
// constructor of abstract class
// abstract class can have constructor but cannot be instantiated i.e. it cannot create objects of its own.
    abclass() {
        System.out.println("constructor from abstract class invoked");
    }
//  abstract method in abstract class.
    public abstract void abm();
//  concrete method in abstract class.
    public void show() {
        System.out.println("non abstract method inside abstract class");
    }

    void sum() {
        System.out.println("enter both the numbers:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        System.out.println("sum: " + (m + n));
    }
//  overrides abstract method from parent class but doesn't define its body.
//  its body can be defined in the concrete class inherits this class.
    @Override
    abstract void hello();
}
