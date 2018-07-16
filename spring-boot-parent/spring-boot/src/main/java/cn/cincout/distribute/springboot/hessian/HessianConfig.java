package cn.cincout.distribute.springboot.hessian;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
public class HessianConfig {

    @Bean(name = "/sayHello")
    public HessianServiceExporter hessianServiceExporter(@Qualifier("helloServiceImpl") HelloService helloService) {
        HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();
        hessianServiceExporter.setService(helloService);
        hessianServiceExporter.setServiceInterface(HelloService.class);
        return hessianServiceExporter;
    }
}
