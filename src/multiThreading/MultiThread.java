package multiThreading;

public class MultiThread {
    public static void main(String[] args) {
//        create a thread using the thread consturctor
        Thread t1 = new Thread();
        Thread t2 = Thread.currentThread();
        System.out.println(t2);
        ThreadCreateClass tcc1 = new ThreadCreateClass();
        ThreadCreateClass tcc2 = new ThreadCreateClass();
//        System.out.println(t.getName());
//        set a name to the thread using the setName() method.
        t1.setName("HelloWorld");
//        get the name of the thread using the getName() method.
        System.out.println(t1.getName());
//        get the priority of a thread using the thread priority method
        System.out.println(t1.getPriority());
//        check if a thread is alive or not using isAlive() mehtod.
        System.out.println(t1.isAlive());
//        Starts the tcc2 Thread using start() method.
        tcc1.start();
//        thread tcc1 calls the join() method which makes the tcc2 thread wait
//        till tcc1 finish its execution completely.
//        try{
//            tcc1.join();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        Starts the tcc2 Thread using start() method.
        tcc2.start();
//        the number of active threads in the current thread's threadGroup and
//        subgroup can be found out using activeCount() method.
        System.out.println(ThreadCreateClass.activeCount());
//        prints the stack trace of the thread using dumpStack() method. it throws an exception always.
//        try {
//            Thread.dumpStack();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        System.out.println(t1.getId());
        System.out.println(tcc2.getState());
        System.out.println(tcc2.getThreadGroup());
        tcc2.interrupt();
        System.out.println(Thread.interrupted());
        System.out.println(tcc1.isDaemon());
        System.out.println(tcc1.isInterrupted());
//        tcc1.setDaemon(false);
        System.out.println(tcc1.isDaemon());
        tcc1.setPriority(7);
        System.out.println(tcc1.getPriority());
//        tcc1.yield();
//        shutdown hook demonstration
        Runtime rt = Runtime.getRuntime();
        ShHook sh = new ShHook();
        rt.addShutdownHook(sh);
        Runtime.getRuntime().addShutdownHook(new ShHook());
    }

}

class ThreadCreateClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
//            makes the thread sleep for 0.1s (100ms) in each iteration.
//            try {
//                Thread.sleep(100);
//            }catch (Exception w){
//                w.printStackTrace();
//            }
        }

    }
}
class ShHook extends Thread{
    @Override
    public void run(){
        System.out.println("shutdown hook");
        System.out.println("bye");
    }
}
