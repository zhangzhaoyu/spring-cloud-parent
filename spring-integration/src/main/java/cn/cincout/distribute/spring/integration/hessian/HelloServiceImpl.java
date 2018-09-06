package cn.cincout.distribute.spring.integration.hessian;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by zhaoyu on 18-8-14.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        log.info("hello : " + name + ", time is " + new Date().toString());
        return "hello : " + name + ", time is " + new Date().toString();
    }
}
