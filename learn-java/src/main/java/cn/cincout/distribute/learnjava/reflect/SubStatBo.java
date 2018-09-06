package cn.cincout.distribute.learnjava.reflect;

import lombok.Data;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
public class SubStatBo extends StatBo {
    private String name;

    public SubStatBo(long count, double price, String name) {
        super(count, price);
        this.name = name;
    }
}
