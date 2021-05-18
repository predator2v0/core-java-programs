package abstractClass;

abstract class abclass extends baclass {
    int m = 5, n;

    abclass() {
        System.out.println("constructor from abstract class invoked");
    }

    public abstract void abm();

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

    @Override
    abstract void hello();
}
