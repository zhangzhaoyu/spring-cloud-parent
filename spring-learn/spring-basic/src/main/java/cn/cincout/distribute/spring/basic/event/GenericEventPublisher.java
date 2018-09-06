package cn.cincout.distribute.spring.basic.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@Slf4j
public class GenericEventPublisher implements ApplicationRunner, ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // this.applicationEventPublisher.publishEvent(new EntityCreatedEvent<>(new Object(), new Person("zhang")));
        this.applicationEventPublisher.publishEvent(new PersonCreatedEvent(new Object(), new Person("zhang")));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
