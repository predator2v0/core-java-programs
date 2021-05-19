package multiThreading;

public class ThreadSync {
    public static void main(String[] args) throws Exception {
        Incr in = new Incr();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    in.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    in.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

//        in two loops, the value is inctemented upto 20000 times.
//        it won't count upto 20000 unless it is synchronised
//        i.e. if the increment method is declared synchronised, it will increment 20000 times else the value will be less than that
        System.out.println("Coune: "+in.count);

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<1000;i++){
                    synchronized (in){
                        in.display();
                    }
                }
            }
        });
        Thread t4 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i<1000; i++){
                    synchronized (in){
                        in.display();
                    }
                }
            }
        });
        t3.start();
        t4.start();

        t3.join();
        t4.join();
        System.out.println("Value: "+in.val);
    }
}

class Incr {
    int count;

    public synchronized void increment() {
        count++;
    }
    int val;
    public void display(){
        val++;
    }
}