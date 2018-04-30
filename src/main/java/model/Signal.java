package model;

import util.Util;

import java.util.concurrent.CountDownLatch;

public class Signal implements Runnable {

    private CountDownLatch countDownLatch;

    private final int COUNT = 4;


    public Signal(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        signalDecrement();
    }

    private void signalDecrement() {
        while (countDownLatch.getCount() > 0) {
            Util.sleep();
            System.out.println("Signal№ " + (COUNT - countDownLatch.getCount()));
            countDownLatch.countDown();
        }
    }
}
