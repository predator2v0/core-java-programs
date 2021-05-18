package exceptionHandling;

public class OverridingException extends OverriddenException {
    public static void main(String[] args) {
        OverridingException oe = new OverridingException();
        try {
            oe.hello();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void hello() throws ArithmeticException{
        System.out.println("hello from child");
    }
}

class OverriddenException {
    public void hello()  {
        System.out.println("Hello");
    }
}