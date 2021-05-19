package multiThreading;

public class ThrGroup extends Thread {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("tg1");
        ThreadGroup tg2 = new ThreadGroup(tg1, "tg2");
        ThrD td = new ThrD();
        RunD rd = new RunD(tg2, "rd");
        Thread t1 = new Thread(tg1, td, "Thread 1 Group 1");
        Thread t2 = new Thread(tg1, td, "Thread 2 Group 1");
        Thread t3 = new Thread(tg2, rd, "Thread 1 Group 2");
        Thread t4 = new Thread(tg2, rd, "Thread 2 Group 2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(tg1.activeCount());
        System.out.println(tg2.activeCount());
        System.out.println(tg1.activeGroupCount());
        System.out.println(tg2.activeGroupCount());
        tg1.checkAccess();
        System.out.println(tg1.getName() + " has access");
//        tg1.destroy();
//        System.out.println(tg1.isDestroyed());
        Thread[] tarr = new Thread[tg2.activeCount()];
        int ac = tg2.enumerate(tarr);
        System.out.println("tarr " + ac);
        for (int i = 0; i < tg2.activeCount(); i++) {
            System.out.println("@ " + tarr[i]);
        }
        System.out.println("tg1 maxPriority:" + tg1.getMaxPriority());
        System.out.println("tg2 maxPriority:" + tg2.getMaxPriority());
        System.out.println("tg1 group name: " + tg1.getName());
        System.out.println("tg2 group name: " + t4.getThreadGroup().getName());
        System.out.println("tg2 parent group: " + tg2.getParent());
        tg2.interrupt();
        tg1.interrupt();
        System.out.println(tg2.isDaemon());
        tg2.setDaemon(true);
        System.out.println(tg2.isDaemon());
        System.out.println(tg1.isDaemon());
        tg2.setDaemon(false);
        System.out.println(tg2.isDaemon());
        tg1.list();
        tg2.list();
        System.out.println(tg1.parentOf(tg2));
        tg2.setMaxPriority(NORM_PRIORITY);
        System.out.println("tg2 max prio "+tg2.getMaxPriority());
        System.out.println(tg1.toString());
        tg2.stop();
    }
}

class ThrD implements Runnable {
    @Override
    public void run() {
        System.out.println("implements Runnable");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("sleep interruption Runnable");
        }
    }
}

class RunD extends Thread {

    public RunD(ThreadGroup tg, String name) {
        super(tg, name);
    }

    @Override
    public void run() {
        System.out.println("extends Thread");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("sleep interruption THread");
        }
    }
}