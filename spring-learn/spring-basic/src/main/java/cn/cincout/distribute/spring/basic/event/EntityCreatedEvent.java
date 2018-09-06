package cn.cincout.distribute.spring.basic.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class EntityCreatedEvent<T> extends ApplicationEvent {
    private T t;

    public EntityCreatedEvent(Object source, T t) {
        super(source);
        this.t = t;
    }

    @Override
    public String toString() {
        return "EntityCreatedEvent{" +
                "t=" + t +
                '}';
    }
}
