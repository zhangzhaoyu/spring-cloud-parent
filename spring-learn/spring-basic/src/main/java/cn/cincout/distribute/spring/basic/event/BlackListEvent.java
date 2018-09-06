package cn.cincout.distribute.spring.basic.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class BlackListEvent extends ApplicationEvent {
    private final String address;
    private final String test;

    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
    }
}
