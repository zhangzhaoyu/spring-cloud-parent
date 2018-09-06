package cn.cincout.distribute.learnjava.reflect.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhaoyu on 18-8-15.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class PerformanceHandler implements InvocationHandler {

    private Object target;

    public PerformanceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin ...");
        System.out.println(proxy.getClass().getName());
        Object result = method.invoke(target, args);
        System.out.println("end ...");
        return result;
    }
}
