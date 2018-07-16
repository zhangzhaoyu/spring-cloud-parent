package cn.cincout.distribute.springboot.web.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Created by zhaoyu on 18-6-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
@AllArgsConstructor
@Builder
public class Message {
    private int status;
    private String message;
}
