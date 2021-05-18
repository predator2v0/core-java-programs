package enumerations;

enum Enm {
    //    enum are named constants.
    //    these are the static final objects of a class with same name as enum(created after compilation).
    SUN, MON, TUE, WED, THU, FRI, SAT;
    String day;

    public String getDay() {
        return day;
    }
}
enum Stud {
    //constants with values initialized with parametrized constructor(age) & default constructor()
    JOHN(10), SAM(12),BELLA;
//    data members in enum
    private int age;
//    member functions in enum
    int getAge(){
        return age;
    }
//    constructors in enum
    Stud(){
        age = 11;
    }
    Stud(int age){
        this.age = age;
    }
}

public class Enumerations {
    public static void main(String[] args) {

        Enm en = Enm.FRI;
//        System.out.println(en);
//        System.out.println(en.SAT);
        if (en == Enm.FRI)
            System.out.println("TRUE");
        switch (en) {
            case SUN:
                System.out.println("sunday");
                break;
            case MON:
                System.out.println("monday");
                break;
            case TUE:
                System.out.println("tuesday");
                break;
            case WED:
                System.out.println("wednesday");
                break;
            case THU:
                System.out.println("thursday");
                break;
            case FRI:
                System.out.println("friday");
                break;
            case SAT:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid");
        }
        System.out.println();
        Enm e = Enm.valueOf("SAT");
        System.out.println(e);
        System.out.println();
        Enm enu[] = Enm.values();
        for (Enm ee : enu) {
            System.out.println(ee);
        }
//        in case of nested enum
//        OuterEnum.InnerEnum Identifier = OuterEnum.InnerEnum.Constant;
//        Enm.Stud st = Enm.Stud.BELLA ;
//        System.out.println(st.getAge());
        Stud st = Stud.SAM;
        System.out.println("Age of SAM is: "+st.getAge()+" years");
        System.out.println("Age of BELLA is: "+Stud.BELLA.getAge()+" years");
        System.out.println("Age of JOHN is: "+Stud.JOHN.getAge()+" years");
    }
}
