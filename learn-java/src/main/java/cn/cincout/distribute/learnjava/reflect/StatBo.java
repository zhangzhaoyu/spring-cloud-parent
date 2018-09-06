package cn.cincout.distribute.learnjava.reflect;

import lombok.Data;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
public class StatBo {
    private long count;
    private double price;

    public StatBo() {
    }

    public StatBo(long count, double price) {
        this.count = count;
        this.price = price;
    }

    public double getPrice() {
        System.out.println("getPrice");
        return this.price;
    }
}
