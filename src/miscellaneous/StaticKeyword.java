package miscellaneous;

import java.util.Scanner;

public class StaticKeyword{
    static int k = 6;
    public static void main(String[] args){
        int k = 5;
        System.out.println(k);
        System.out.println(StaticKeyword.k);
        welcome();              // calling static method without instance of the class
        Scanner s = new Scanner(System.in);
        System.out.println("enter the product id: ");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("enter the product name: ");
        String name = s.nextLine();
        StaticKeyword sk = new StaticKeyword();
        // non static methods called using instance of the class
        sk.getProductDetails(id, name);
        sk.showDetails();

        s.close();
    }
    int id;
    String product;
    static String manufacturer; // static data member

    // static block
    static{
        System.out.println("static block: will be executed first");
        System.out.println("static members initialized:");
        Scanner s = new Scanner(System.in);
        manufacturer = s.nextLine();
    }
    private void getProductDetails(int id, String product){
        this.id = id;
        this.product = product;
    }
    public void showDetails(){
        System.out.println("\nproduct id: "+id+"\t product name: "+product+"\nmanufacturer: "+manufacturer);
    }
    // static method
    static void welcome(){
        System.out.println("welcome to the static keyword demo :)");
    }
}