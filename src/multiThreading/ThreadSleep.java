package multiThreading;

public class ThreadSleep {
    public static void main(String[] args) {
        ThSleep ths = new ThSleep();
        System.out.println(ths.getName());
        ths.start();
        Thread th = new ThSleep();
        th.start();
        try {
            ThSleep.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ThSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThSleep: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}