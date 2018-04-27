import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Theater {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Signal(countDownLatch));
        executorService.submit(new Performance(countDownLatch));
        executorService.shutdown();

    }
}
