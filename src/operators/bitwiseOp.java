package operators;

public class bitwiseOp {
    public static void main(String[] args) {
        int a = 5, b = 6;
        //bitwise and, or, not
        System.out.println("a&b: "+(a&b));
        System.out.println("a|b: "+(a|b));
        System.out.println("a^b: "+(a^b));
        //bitwise shift operators
        System.out.println("a>>2: "+(a>>2));
        System.out.println("b<<2: "+(a<<2));
    }
}
