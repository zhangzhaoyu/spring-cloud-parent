package cn.cincout.distribute.spring.basic.event;

import lombok.extern.slf4j.Slf4j;
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
public class EmailService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void sendEmail(String address, String text) {
        BlackListEvent event = new BlackListEvent(this, address, text);
        applicationEventPublisher.publishEvent(event);
    }
}
