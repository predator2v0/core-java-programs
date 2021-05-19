package strings;

public class StringFormat {
    public static void main(String[] args){
        String greet = "hello!";
        String name = new String("Subhakanta");
        int i = 5;
        float f = 5.8f;
        double d = 9.83;
        long l = 342;
        char c  = 'c';

//      application of string format() method [from beginnersbook.com]
//      concatenate Strings.
        System.out.println(String.format("my name is %S",name));
        System.out.println(String.format("my name is %s",name));
//      concatenate string with other data types
        System.out.println(String.format("marks %.2f,%f",d,f));
//      concatenation of arguments to the string
//        %1$,%2$,%3$... are used for serialising the arguments
        System.out.println(String.format("String with all types of arguments is: %2$s,%1$s,%3$d,%4$f,%5$f,%6$d,%7$c",greet,name,i,f,d,l,c));
//        padding values
        System.out.println(String.format("%03d",5));
        System.out.println(String.format("%-3d",8));
        System.out.println(String.format("%h",name));
        System.out.println(String.format("%b",false));
        System.out.println(String.format("%,d",25122021));
    }
}
