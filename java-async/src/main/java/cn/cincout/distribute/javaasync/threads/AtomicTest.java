package cn.cincout.distribute.javaasync.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhaoyu on 2019-01-24.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class AtomicTest {
    public static class CountThread extends Thread {
        private AtomicInteger atomicInteger = new AtomicInteger(0);

        @Override
        public void run() {
            for (int i = 0; i < 5000; i++) {
                System.out.println(atomicInteger.incrementAndGet());
            }
        }
    }

    public static void main(String[] args) {
        CountThread countThread = new CountThread();
        new Thread(countThread).start();
        new Thread(countThread).start();
        new Thread(countThread).start();
    }
}
