package multiThreading;

public class ThreadJoin {
    public static void main(String[] args){
        ThJoin thj = new ThJoin();
        ThrJoin thrj = new ThrJoin();
        System.out.println("in main: start");
        thj.start();
        thrj.start();
        try{
            thj.join(1500);
            thrj.join();
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("in main: end");
    }
}
class ThJoin extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("ThJoin: "+i);
        }
    }
}
class ThrJoin extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThrJoin: " + i);
        }
    }
}