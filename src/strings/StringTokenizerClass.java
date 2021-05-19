package strings;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("hello my name subhakanta roul", " ");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        StringTokenizer str = new StringTokenizer("hihi hihi hehe hehe hihi hehe");
        System.out.println(str.countTokens());
        while (str.hasMoreElements()) {
            System.out.println(str.nextElement());
        }
    }
}
