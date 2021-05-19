package strings;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello String Buffer");
        System.out.println(sb);
        System.out.println(sb.hashCode() + " " + sb.capacity());
        String st = new String("hello");
        System.out.println(st);
        sb.append(" welcome");
        st.concat("welcome");
        System.out.println(sb);
        System.out.println(sb.hashCode() + " " + sb.capacity());
        System.out.println(st);

        StringBuffer sbe = new StringBuffer(25);
        sbe.append("hello");
        System.out.println(sbe + " " + sbe.length() + " " + sbe.capacity());
        StringBuffer sbc = new StringBuffer();
        System.out.println(sbc.capacity());
        String stri = new String("world");
        StringBuffer stbf = new StringBuffer(stri);
        System.out.println(stbf);

        stbf.insert(0, "hello ");
        System.out.println(stbf);

        System.out.println(stbf.reverse());
        stbf.reverse(); // to reverse the reversed string again.

        System.out.println(stbf.replace(0, 5, "hi!"));

        StringBuffer stbfr = new StringBuffer(9);
        System.out.println(stbfr.capacity());
        stbfr.append("subhakanta");
        System.out.println(stbfr);
        System.out.println(stbfr.capacity());
        stbfr.ensureCapacity(23);
        System.out.println(stbfr.capacity());
    }
}
