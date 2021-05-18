package generics;

public class Generics {
    int val;
    float fl;
//    generic constructor in a non generic class
    <V extends Integer, S extends Float> Generics(V v,S s){
        val = v;
        fl = s;
        System.out.println(val +" "+fl);
    }
    public static void main(String[] args) {
//        generic object initialization
        GenClass<Integer> obj1 = new GenClass<>(5, 6);
        System.out.println(obj1.getOb() + " " + obj1.getX());
        GenClass<String> obj2 = new GenClass<>("HELLO WORLD", 6);
        System.out.println(obj2.getOb() + " " + obj1.getX());
        GenClass<Character> obj3 = new GenClass<>('c', 6);
        System.out.println(obj3.getOb() + " " + obj1.getX());

        GenericClass<Integer,String> obj4 = new GenericClass<>(5,"hello");
        System.out.println(obj4.getTob());
        System.out.println(obj4.getUob());

        System.out.println(add(5,5));

        Generics gs = new Generics(195,220f);


    }
//    generic method in a non generic class
    public static <T extends Integer> int add(T t, T u){
        int sum = t.intValue() + u.intValue();
        return sum;
    }
}

// generic class example
class GenClass<T> {
    public T ob;
    private int x;

    GenClass(T ob, int x) {
        this.ob = ob;
        this.x = x;
    }

    public T getOb() {
        return ob;
    }

    public int getX() {
        return x;
    }
}

// generic class with multiple parameter example
class GenericClass<T, U> {
    public T tob;
    public U uob;

    public GenericClass(T tob, U uob) {
        this.tob = tob;
        this.uob = uob;
    }

    public T getTob() {
        return tob;
    }

    public U getUob() {
        return uob;
    }
}