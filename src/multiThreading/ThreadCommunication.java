package multiThreading;

public class ThreadCommunication {
    public static void main(String[] args) {
        ThrComm tc = new ThrComm();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    tc.put(i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    tc.get();
                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}

class ThrComm {
    int val;
    boolean valSet = false;

    public synchronized void put(int i) {
        if (valSet == true) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        val = i;
        valSet = true;
        System.out.println("putValue: " + val);
        notify();
    }

    public synchronized void get() {
        if (valSet == false) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("getValue: " + val);
        valSet = false;
        notify();
    }
}