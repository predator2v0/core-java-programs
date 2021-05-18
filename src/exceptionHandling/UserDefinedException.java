package exceptionHandling;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = s.nextInt();
        for (int i = num; i > 0; i--) {
            try {
                if (i == 1) {
                    throw new MyCustomException("cannot divide by 1 :)");
                }
                System.out.println(num / i);

            } catch (MyCustomException me) {
                System.out.println(me);
            }
        }
        try {
            myMethod();
        } catch (MyCustomException m) {
            System.out.println(m);
        }
    }

    public static void myMethod() throws MyCustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.println(num / i);
        }
    }
}

class MyCustomException extends Exception {
    public MyCustomException(String s) {
        super(s);
    }
//    public String toString(){
//        String exc = " :divided by 1!! not allowed";
//        return exc;
//    }
}