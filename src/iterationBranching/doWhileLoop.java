package iterationBranching;

public class doWhileLoop {
    public static void main(String[] args) {
        int n = 10, i = 1;
        do{
            System.out.print(n +" * "+ i +" = "+ (n*i) + "\t");
            ++i;
        }while(i <= n);
    }
}
