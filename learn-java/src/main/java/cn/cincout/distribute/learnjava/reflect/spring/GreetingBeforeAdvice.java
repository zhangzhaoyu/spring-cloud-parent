package cn.cincout.distribute.learnjava.reflect.spring;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by zhaoyu on 18-8-15.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object o) throws Throwable {
        String clientName = (String) args[0];
        System.out.println("How are you ! Mr." + clientName);
    }
}
