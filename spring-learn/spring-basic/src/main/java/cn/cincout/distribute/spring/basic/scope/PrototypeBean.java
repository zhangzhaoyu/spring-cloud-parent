package cn.cincout.distribute.spring.basic.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-7-19.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Component
@Scope("prototype")
public class PrototypeBean implements InitializingBean, DisposableBean {

    // do not call for prototype bean
    // Spring does not manage the complete lifecycle of a prototype bean
    // although initialization lifecycle callback methods are called on all objects regardless of scope,
    // in the case of prototypes, configured destruction lifecycle callbacks are not called
    @Override
    public void destroy() throws Exception {
        log.info("... destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("... afterPropertiesSet");
    }

    public void hello(String name) {
        log.info("hello {}", name);
    }
}
