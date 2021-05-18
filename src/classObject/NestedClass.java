package classObject;

interface AnonymousIntf {
    void anonymousMethodOne();

    void anonymousMethodTwo();
}

public class NestedClass {
    static int sncv = 1;
    int ncv = 2;
    AnonymousIntf ain = new AnonymousIntf() {
        @Override
        public void anonymousMethodOne() {
            System.out.println("inside Anonymous Method One\n overridden from anonymous interface abstract method.");
        }

        @Override
        public void anonymousMethodTwo() {
            System.out.println("inside anonymous interface two\n overriding the abstract method");
        }
    };
    private int pin = 3;

    public static void main(String[] args) {
        NestedClass nc = new NestedClass();
        NestedClass.NestedInnerOne nio = nc.new NestedInnerOne();
        System.out.println(nio.idk);
        nc.instantiateInnerClassTwo();
        StaticNestedClass snc = new StaticNestedClass();
        System.out.println(snc.st);
        System.out.println(NestedClass.StaticNestedClass.stn);
        snc.staticNestedClassMethod();
        nio.NestedInnerOneSum();
        System.out.println(nio.niopin++);
        OuterSecondClass osc = new OuterSecondClass();
        osc.DisplayOuterSecondClass();
        localInnerMethod();

    }

    static void localInnerMethod() {
        class LocalInnerClass {
            int lic = 7;

            public void showLicVal() {
                System.out.println(lic);
            }
        }
        LocalInnerClass licl = new LocalInnerClass();
        licl.showLicVal();
    }

    public void instantiateInnerClassTwo() {
        NestedClassTwo nct = new NestedClassTwo();
        System.out.println(nct.nm);
        ain.anonymousMethodOne();
        ain.anonymousMethodTwo();
    }

    static class StaticNestedClass {
        static String stn = "Static Nested Class String";
        int st = 5;

        void staticNestedClassMethod() {
//            System.out.println(ncv); // static class cannot refer to non static member of outer(enclosing) class.
            System.out.println(sncv);
        }
    }

    class NestedInnerOne {
        int idk = 4;
        private int niopin = 6;

        public void NestedInnerOneSum() {
            System.out.println(idk + pin);
        }
    }

    class NestedClassTwo {
        String nm = "Subhakanta Roul";

    }
}

class OuterSecondClass {
    NestedClass ncc = new NestedClass();
    NestedClass.NestedInnerOne ncnio = ncc.new NestedInnerOne();

    void DisplayOuterSecondClass() {
        ncnio.NestedInnerOneSum();
    }
}