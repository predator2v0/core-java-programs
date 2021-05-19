package iterationBranching;

public class nestedIf {
    public static void main(String[] args) {
        float perc = 5;
        if(perc < 100){
            if(perc > 33){
                System.out.println("pass");
            }
            else{
                System.out.println("fail");
            }
        }
    }
}
