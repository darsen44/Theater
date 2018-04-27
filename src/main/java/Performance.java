import java.util.concurrent.CountDownLatch;

public class Performance implements Runnable {

    private CountDownLatch countDownLatch;

    public Performance(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        begin();
    }

    private void begin(){
        try {
            countDownLatch.await();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("(Light is off)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("(Music begin to play)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ladies and Gentlemen, we are glad to welcome you on performance"
                +"\n" + " Cursor's Friends!"
                + "\n" + "Applause!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
