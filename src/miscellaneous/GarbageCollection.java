package miscellaneous;

import java.util.Scanner;

public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection gcl = new GarbageCollection();
        gcl.sum();
        // GarbageCollection gc2 = new GarbageCollection();
        // gc2 = gcl;
        gcl = null;
        System.gc();
    }
    int a,b;
    GarbageCollection(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        s.close();
    }
    void sum(){
        System.out.println("sum: "+(a+b));
    }
    static void bye(){
        System.out.println("bye bye garbage collector!!");
    }
    protected void finalize(){
        System.out.println("Garbage collector finalize method");
        bye();
    }
}
