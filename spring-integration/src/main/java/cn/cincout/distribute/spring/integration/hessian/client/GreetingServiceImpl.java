package cn.cincout.distribute.spring.integration.hessian.client;

import cn.cincout.distribute.spring.integration.hessian.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by zhaoyu on 18-8-14.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@Slf4j
public class GreetingServiceImpl implements GreetingService, ApplicationRunner {

    @Resource(name = "clientHelloService")
    private HelloService helloService;

    @Override
    public void greeting() {
        log.info("call greeting");
        helloService.sayHello("zzy");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.greeting();
    }
}
