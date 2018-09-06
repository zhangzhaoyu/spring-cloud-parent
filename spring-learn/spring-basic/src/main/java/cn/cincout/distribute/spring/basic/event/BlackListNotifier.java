package cn.cincout.distribute.spring.basic.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-8-8.
 *  by default event listeners receive events synchronously
 * @author zhaoyu
 * @sine 1.8
 */
@Component
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
    }

    @EventListener
    /**
     * as of spring 4.2
     */
    public void processBlackListEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
    }

    @EventListener({ContextStartedEvent.class, ContextRefreshedEvent.class})
    public void handleContextStart(ApplicationContextEvent event) {

    }

    @EventListener(condition = "#blEvent.test == 'foo'")
    /**
     * with SpEL
     */
    public void processBlackListEventWithSpEL(BlackListEvent blEvent) {
        // notify appropriate parties via notificationAddress...
    }

    @EventListener
    @Async
    /**
     * If the event listener throws an Exception it will not be propagated to the caller,
     * check AsyncUncaughtExceptionHandler for more details.
     *
     * Such event listener cannot send replies.
     * If you need to send another event as the result of the processing,
     * inject ApplicationEventPublisher to send the event manually.
     */
    public void processBlackListEventAsync(BlackListEvent event) {
        // BlackListEvent is processed in a separate thread
    }
}
