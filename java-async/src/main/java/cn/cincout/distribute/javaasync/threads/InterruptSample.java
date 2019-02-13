package cn.cincout.distribute.javaasync.threads;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhaoyu on 2019-01-31.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class InterruptSample {
    public static void main(String[] args) throws InterruptedException {
        //MyThreadGroup group = new MyThreadGroup("my group");

        // Thread thread = new Thread(group, new Task());
        Thread thread = new Thread(new Task());
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("static exception handle");
        });

        //thread.setUncaughtExceptionHandler((t, e) -> System.out.println("instance exception handle"));
        thread.start();

        TimeUnit.SECONDS.sleep(3);
        thread.interrupt();
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(LocalDateTime.now().toString());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class MyThreadGroup extends ThreadGroup {

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("in group exception handle");
    }
}
