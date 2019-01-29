package cn.cincout.distribute.javaasync.future;

import java.util.concurrent.CompletableFuture;

/**
 * Created by zhaoyu on 2019-01-21.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class CompletableFutureSample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("hello world");
            System.out.println(Thread.currentThread().getName());
            return 1;
        });
    }
}
