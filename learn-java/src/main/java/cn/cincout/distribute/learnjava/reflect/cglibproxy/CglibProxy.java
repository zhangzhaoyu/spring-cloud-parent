package cn.cincout.distribute.learnjava.reflect.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhaoyu on 18-8-15.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin ...");
        System.out.println(methodProxy.getClass().getName());
        Object result = methodProxy.invokeSuper(o, args);
        System.out.println("end ...");
        return result;
    }
}
