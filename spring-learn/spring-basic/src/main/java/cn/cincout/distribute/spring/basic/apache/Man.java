package cn.cincout.distribute.spring.basic.apache;

import lombok.Builder;
import lombok.Data;

/**
 * Created by zhaoyu on 18-8-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */


@Data
@Builder
public class Man {
    private String name;
    private int age;
}
