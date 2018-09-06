package cn.cincout.distribute.spring.basic.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaoyu on 18-7-12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class ApplicationContextSample {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/xml/beans.xml");
        applicationContext.registerShutdownHook();

        HelloService helloService = applicationContext.getBean(HelloService.class);
        System.out.println(helloService.sayHello("zhangzhaoyu"));
    }
}
