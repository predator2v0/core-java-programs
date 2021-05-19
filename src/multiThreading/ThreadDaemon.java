package multiThreading;

public class ThreadDaemon {
    public static void main(String []args){
        Thread t = new Thread();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
        System.out.println(t.getPriority());
    }
}
