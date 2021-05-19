package operators;

public class miscOp {
    public static void main(String[] args) {
        //conditional operator (ternary operator).
        int a = 5, b = 7;
        int c = (a > b) ? a : b;
        System.out.println(c + " is greater");
        boolean bn = (a>b)?true:false;
        System.out.println(bn);
        //instance of operator
        miscOp mo = new miscOp();
        boolean bool = mo instanceof miscOp;
        System.out.println(bool);
        int arr[] = new int[4];
        System.out.println(arr instanceof Object);
    }
}
