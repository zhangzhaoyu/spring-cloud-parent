package cn.cincout.distribute.spring.basic.ioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class Bar implements InitializingBean {

    public Bar() {
        log.info("call Bar constructor");
    }

    @PostConstruct
    public void init() {
        log.info("call Bar PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("call InitializingBean afterPropertiesSet");
    }
}
