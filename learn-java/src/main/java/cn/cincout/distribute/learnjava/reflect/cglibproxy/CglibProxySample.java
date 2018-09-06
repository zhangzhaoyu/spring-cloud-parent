package cn.cincout.distribute.learnjava.reflect.cglibproxy;

import cn.cincout.distribute.learnjava.reflect.jdkproxy.HelloServiceImpl;

/**
 * Created by zhaoyu on 18-8-15.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class CglibProxySample {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        HelloServiceImpl helloService = (HelloServiceImpl) cglibProxy.getProxy(HelloServiceImpl.class);
        String result = helloService.say("xiaozhang");
        System.out.println(result);
        System.out.println(helloService.getClass().getName());
    }
}
