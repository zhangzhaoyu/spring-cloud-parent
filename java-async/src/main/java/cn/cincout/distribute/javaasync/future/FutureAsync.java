package cn.cincout.distribute.javaasync.future;

import java.util.concurrent.*;

/**
 * Created by zhaoyu on 18-6-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class FutureAsync {
    ExecutorService executorService = Executors.newCachedThreadPool();

    public static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("task is running ...");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("finished task ...");
            return "success";
        }
    }

    public void runTask(Callable<String> callable) {
        Future<String> result = this.executorService.submit(callable);

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("sum is : " + sum);

        try {
            System.out.println(result.get(6, TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    public static void main(String[] args) {
        new FutureAsync().runTask(new Task());
    }
}
