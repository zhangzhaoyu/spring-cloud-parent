package cn.cincout.distribute.javaasync.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * Created by zhaoyu on 19-1-18.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class Shop {
    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread(() -> {
            double price = calculatePrice(product);
            futurePrice.complete(price);
        }).start();

        return futurePrice;
    }


    public double getPrice(String product) {
        return calculatePrice(product);
    }

    private double calculatePrice(String product) {
        delay();
        return product.charAt(0) + product.charAt(1);
    }
}
