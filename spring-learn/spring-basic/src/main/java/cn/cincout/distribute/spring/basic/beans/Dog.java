package cn.cincout.distribute.spring.basic.beans;

import lombok.Data;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
public class Dog {
    private String name;

    @Data
    public static class Foot {
        private int length;
    }
}
