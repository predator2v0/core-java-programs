package miscellaneous;

public class ThisKeyword {
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword(4,5);
        // tk.displayVals();
        new ThisKeyword();
        System.out.println(tk.objectReturn());
    }
    int a,b;
    ThisKeyword(int a, int b){
        this.a = a;
        this.b = b;
    }
    ThisKeyword(){
        this("constructor call using this keyword");
    }
    ThisKeyword(String str){
        System.out.println(str);
    }
    void displayVals(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    ThisKeyword objectReturn(){
        this.displayVals();
        return this;
    }
}
