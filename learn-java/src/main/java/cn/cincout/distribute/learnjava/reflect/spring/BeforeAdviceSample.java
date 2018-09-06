package cn.cincout.distribute.learnjava.reflect.spring;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by zhaoyu on 18-8-15.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class BeforeAdviceSample {
    public static void main(String[] args) {
        Waiter waiter = new WaiterImpl();

        BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(beforeAdvice);

        Waiter proxyWaiter = (Waiter) proxyFactory.getProxy();
        proxyWaiter.greetTo("zzy");
        proxyWaiter.serviceTo("zzy");
    }
}
