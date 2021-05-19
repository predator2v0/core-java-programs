package multiThreading;

/*
* demonstration of interthread communication
* using wait() and notify() methods of the object class
* the wait() and notify() methods can be called from within a synchronized context only.
* hence either use them within a synchronized method or a synchronized block.
* the lock
* */
public class ThreadCommunication2 {
    public static void main(String[] args) {
        TComm tc = new TComm();
        Tthread tt = new Tthread(tc);
        Sthread st = new Sthread(tc);
        Thread tht = new Thread(tt);
        tht.start();
        st.start();

    }
}

class TComm {
    String[] tMsg = {"hi!", "how are you?", "all the best"};
    String[] sMsg = {"hello!!", "I'm fine.", "Thank You!"};
    boolean flag = false;

    public  void t(String str) {
        synchronized(this){
            while (flag) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(str);
            flag = true;
            notify();
        }

    }

    public synchronized void s(String str) {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(str);
        flag = false;
        notify();
    }
}

class Tthread implements Runnable {
    TComm tc1 = new TComm();

    public Tthread(TComm tc) {
        tc1 = tc;
    }

    @Override
    public void run() {
        int size = tc1.tMsg.length;
        for (int i = 0; i < size; i++) {
            tc1.t(tc1.tMsg[i]);
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Sthread extends Thread {
    TComm tc2 = new TComm();

    public Sthread(TComm tc) {
        tc2 = tc;
    }

    @Override
    public void run() {
        int size = tc2.sMsg.length;
        for (int i = 0; i < size; i++) {
            tc2.s(tc2.sMsg[i]);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}