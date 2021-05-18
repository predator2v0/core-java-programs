package abstractClass;

import mypackage.Package;

public class abstractclass extends abclass {
    public static void main(String[] args) {
        abstractclass ab = new abstractclass();
        Package p = new Package();
        p.welcome();
        ab.abm();
        ab.show();
        ab.sum();
        System.out.println("abstract class data member m =" + ab.m);
        p.bye();
        abclass abc = new abstractclass();
        abc.abm();
        abc.hello();
    }

    public void abm() {
        System.out.println("abstract method overriden with a body");
    }

    @Override
    void hello() {
        System.out.println("hello method");
    }
}
