package iterationBranching;

public class elseIfLadder {
    public static void main(String[] args) {
        int marks = 5;
        if(marks >= 60 && marks <100){
            System.out.println("First Division");
        }
        else if(marks >= 50 && marks < 60){
            System.out.println("Second Divison");
        }
        else if(marks >= 30 && marks <50){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }
}
