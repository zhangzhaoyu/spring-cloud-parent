package cn.cincout.distribute.learnjava.reflect.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * Created by zhaoyu on 18-8-15.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class JdkProxySample {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        PerformanceHandler handler = new PerformanceHandler(helloService);

        HelloService proxyHelloService = (HelloService) Proxy.newProxyInstance(
                helloService.getClass().getClassLoader(),
                helloService.getClass().getInterfaces(),
                handler
        );

        String result = proxyHelloService.say("zhang");
        System.out.println(result);
    }

}
