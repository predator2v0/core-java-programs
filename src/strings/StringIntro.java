package strings;

public class StringIntro {
    public static void main(String[] args) {
//        creating a string using string literal
        String str = "Hello World!";
//        creating a string using new keyword
        String st = new String("Hi, I am Subhakanta.");
        System.out.println(str);
        System.out.println(st);
//        System.out.println(str.hashCode());
//        System.out.println(st.hashCode());
//        String smr = new String("Hello World!"); //"hello World!"; //st; //str.concat(st);
//        System.out.println(smr.hashCode());
//        concatenation of strings
        /*
        * 1. using String concat() method [String.concat(String)]
        * 2. using + operator [String1 + String2]
        * */
        String strts = str.concat(st);
        System.out.println(strts);
        strts = st + str + 1;
        System.out.println(strts);
//        compare Strings
        /*
        * three ways to compare
        * 1. using equals() method [boolean equals(string)]
        * 2. using == operator
        * 3. using compareTo() method
        * */
        String str2 = new String("iello World!");
        String str3 = new String("Hello World!");
        String str4 = "hello world!!";

        System.out.println(str2.equals(str));
        boolean b = str.equals("Hello World!");
        System.out.println(b);
        str3 = str2;
        boolean bn = (str3 == str2);
        System.out.println(bn);

        int val = str2.compareTo(str4);
        System.out.println(val);

    }
}
