package modifiers;

public class custompack {
    public static void main(String[] args) {

    }

    void sayhello() {
        System.out.println("hello!");
    }

    public void welcome() {
        System.out.println("welcome to new package");
    }

    protected void createdby() {
        System.out.println("demo created by: Subhakanta roul");
    }

    private void thankyou() {
        System.out.println("thank you! visit again.");
    }

    public void accessprivate() {
        sayhello();
        thankyou();
    }
}