package cn.cincout.distribute.spring.basic.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaoyu on 18-9-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class AopApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(ConcertConfig.class);
        Performance performance = applicationContext.getBean(Performance.class);
        performance.perform();

        Encoreable encoreable = (Encoreable) performance;
        encoreable.hello();
    }
}
