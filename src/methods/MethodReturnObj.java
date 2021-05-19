package methods;

import java.util.Scanner;

public class MethodReturnObj {
    public static void main(String[] args) {
        String nm;
        int idd;
        Scanner s = new Scanner(System.in);
        System.out.println("enter name: ");
        nm = s.nextLine();
        System.out.println("enter id: ");
        idd = s.nextInt();
        ObjMethod om = getDetails(nm, idd); // initializing by a function returning object
        // ObjMethod om = new ObjMethod(nm, idd); // initializing by using constructor.
        System.out.println(om.name);
        System.out.println(om.id);
        s.close();
    }

    static ObjMethod getDetails(String str, int i) {
        return new ObjMethod(str, i); // method returning an object.
    }
}

