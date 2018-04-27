import java.util.concurrent.CountDownLatch;

public class Signal implements Runnable {

    private CountDownLatch countDownLatch;

    final int COUNT = 4;


    public Signal(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void run() {
       signalDecrement();
    }

    private void signalDecrement(){
        while (countDownLatch.getCount() > 0){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Signal№ " + ( COUNT -countDownLatch.getCount()));
            countDownLatch.countDown();
        }
    }
}
