package strings;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" world!");
        System.out.println(sb);

        System.out.println(sb.reverse());
        System.out.println("reversing the reverse: " + sb.reverse());

        System.out.println("replacing chars: " + sb.replace(0, 5, "hey,"));
        System.out.println(sb.capacity());
        sb.ensureCapacity(36);
        System.out.println(sb.capacity());
    }
}
