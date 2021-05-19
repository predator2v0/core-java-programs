package iterationBranching;

public class breakStmt {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("initializing break statement...");
        //using break in a loop.
        System.out.println("break in simple loop:");
        for(int i = 0; i<n;i++){
            if(i == 6)
                break;
            System.out.print(n +" * "+ i +" = "+ n*i + "\t");
        }
        System.out.println("\n");
        // using break in nested loop
        System.out.println("break in nested loop:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(j +" * "+ i +" = "+ j*i +"\t");
                if(j == 5)
                    break;
            }
            System.out.println(n +" * "+ i + " = "+ n*i +"\t");
        }
        //using break in switch-case.
        System.out.println("break in switch-case:");
        switch(n){
            case 0:
                System.out.println("false");
                break;
            case 1:
                System.out.println("true");
                break;
            default:
                System.out.println("wrong i/p");
        }
        //break with label
        lab1:
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.println(j-i);
                if(i == 3){
                    break lab1;
                }
            }
        }
    }
}
