package cn.cincout.distribute.springreactive.view;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by zhaoyu on 18-7-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
@RequiredArgsConstructor
public class Message {
    @NonNull
    private int status;
    @NonNull
    private String message;
}
