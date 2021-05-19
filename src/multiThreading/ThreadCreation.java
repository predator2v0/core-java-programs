package multiThreading;

public class ThreadCreation {
    public static void main(String[] args){
        ClassThread ct = new ClassThread();
        InterfaceThread it = new InterfaceThread();
        Thread t = new Thread(it);
        t.start();
        ct.start();
        System.out.println();
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);
    }
}
class ClassThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i< 10; i++){
            System.out.println("hello Thread: "+i);
        }
    }
}
class InterfaceThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i< 10; i++){
            System.out.println("hello Runnable: "+i);
        }
    }
}