package cn.cincout.distribute.springboot.domain;

import lombok.*;

/**
 * Created by zhaoyu on 18-6-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    private int id;
    private String name;
    private String email;
}
