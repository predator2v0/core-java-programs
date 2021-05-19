package miscellaneous;

public class typeCasting {
    public static void main(String[] args) {
        //type conversion(implicit)
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        
        //output
        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);

        //type casting(explicit)
        double db = 10.5;
        float fl = (float)db;
        long lg = (long)fl;
        int in = (int)lg;
        short sr = (short)in;
        byte by = (byte)sr;

        //output
        System.out.println("double: "+db);
        System.out.println("float: "+fl);
        System.out.println("long: "+lg);
        System.out.println("int: "+in);
        System.out.println("short: "+sr);
        System.out.println("byte: "+by);
    }
}
