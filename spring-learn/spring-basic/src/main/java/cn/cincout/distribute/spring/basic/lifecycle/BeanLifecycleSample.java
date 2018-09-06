package cn.cincout.distribute.spring.basic.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhaoyu on 18-7-20.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Component
public class BeanLifecycleSample implements InitializingBean, DisposableBean, SmartLifecycle {

    public BeanLifecycleSample() {
        log.info("... constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log.info("... PostConstruct");
    }

    @Override
    public void destroy() throws Exception {
        log.info("... DisposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("... InitializingBean.afterPropertiesSet");
    }

    @PreDestroy
    public void postDestroy() {
        log.info("... postDestroy");
    }

    @Override
    public boolean isAutoStartup() {
        log.info("SmartLifecycle.isAutoStartup");
        return false;
    }

    @Override
    public void stop(Runnable callback) {
        log.info("SmartLifecycle.stop");
    }

    @Override
    public void start() {
        log.info("SmartLifecycle.start");
    }

    @Override
    public void stop() {
        log.info("SmartLifecycle.stop");
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}
