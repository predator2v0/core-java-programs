package operators;

public class logicalOp {
    public static void main(String[] args) {
        int a = 5, b = 6;
        boolean c = true;
        System.out.println("a<b && a>b : "+(a<b && a>b));
        System.out.println("a<b || a>b : "+(a<b || a>b));
        System.out.println("!c : "+(!c));
    }
}
