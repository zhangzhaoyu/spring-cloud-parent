package cn.cincout.distribute.spring.integration.hessian.client;

import cn.cincout.distribute.spring.integration.hessian.HelloService;
import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

/**
 * Created by zhaoyu on 18-8-14.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class HessianClientSample {
    private final static String HESSIAN_SERVICE_URL = "http://localhost:8080/hessian/hello";
    public static void main(String[] args) {
        HessianProxyFactory factory = new HessianProxyFactory();
        factory.setReadTimeout(5000);
        factory.setConnectTimeout(5000);

        try {
            HelloService helloService = (HelloService) factory.create(HelloService.class, HESSIAN_SERVICE_URL);
            System.out.println(helloService.sayHello("zhangzhaoyu"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
