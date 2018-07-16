package cn.cincout.distribute.springboot.hessian;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
public class HessianClientConfig {
    @Bean("sayHelloService")
    public HessianProxyFactoryBean hessianProxyFactoryBean() {
        HessianProxyFactoryBean factoryBean = new HessianProxyFactoryBean();
        factoryBean.setServiceUrl("http://localhost:8081/sayHello");
        factoryBean.setServiceInterface(HelloService.class);
        return factoryBean;
    }
}
