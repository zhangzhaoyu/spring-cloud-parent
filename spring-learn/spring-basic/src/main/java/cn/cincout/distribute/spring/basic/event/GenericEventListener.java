package cn.cincout.distribute.spring.basic.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@Slf4j
public class GenericEventListener {

    @EventListener
    public void genericEventHandle(EntityCreatedEvent<Person> entityCreatedEvent) {
        log.info("generic event handler {}", entityCreatedEvent);
    }

}
