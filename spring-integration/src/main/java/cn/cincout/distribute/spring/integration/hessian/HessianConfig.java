package cn.cincout.distribute.spring.integration.hessian;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-8-14.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
public class HessianConfig {
    @Bean(name = "/hessian/hello")
    public HessianServiceExporter hessianServiceExporter(@Qualifier("helloServiceImpl") HelloService helloService) {
        HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();
        hessianServiceExporter.setService(helloService);
        hessianServiceExporter.setServiceInterface(HelloService.class);
        return hessianServiceExporter;
    }
}
