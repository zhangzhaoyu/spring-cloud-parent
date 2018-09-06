package cn.cincout.distribute.spring.integration.hessian.client;

import cn.cincout.distribute.spring.integration.hessian.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * Created by zhaoyu on 18-8-14.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
public class HessianClientConfig {

    @Bean
    public HessianProxyFactoryBean clientHelloService() {
        HessianProxyFactoryBean factoryBean = new HessianProxyFactoryBean();
        factoryBean.setServiceInterface(HelloService.class);
        factoryBean.setServiceUrl("http://localhost:8080/hessian/hello");
        return factoryBean;
    }

}
