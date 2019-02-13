package cn.cincout.distribute.javaasync.forkjoin;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyu on 2019-01-30.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class ForkJoinSample {
    public static void main(String[] args) {

    }
}

@Data
@Builder
class Product {
    private String name;
    private double price;

    public static List<Product> generateProducts(int size) {
        List<Product> productList = new ArrayList<>();
        for (int i=0; i < size; i++) {
            productList.add(Product.builder().name("product" + i).price(10.00).build());
        }
        return productList;
    }
}

