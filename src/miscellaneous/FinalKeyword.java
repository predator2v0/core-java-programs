package miscellaneous;

public class FinalKeyword {
    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        System.out.println(fd.n);
        System.out.println(fd.st);
        // System.out.println(++fd.n);     // value of the final variable cannot be changed.
        System.out.println(fd.m);
        System.out.println(FinalDemo.j);
        FinalChild fc = new FinalChild();
        fc.finalMethod();
    }
}
class FinalDemo{
    final int n = 5;
    final int m;
    final String st = "subhakanta";
    FinalDemo(){
        m = 9;
    }
    static final int j;
    static{
        j = 8;
    }
    final void finalMethod(){
        System.out.println("method is declared final");
    }
}
final class FinalChild extends FinalDemo{
    // @Override
    // void finalMethod(){                 // the final methods cannot be overridden.
    //     System.out.println("final method overriding :)");
    // }

}
// class FinalSuperChild extends FinalChild{    //the final class cannot be inherited(extended)

// }