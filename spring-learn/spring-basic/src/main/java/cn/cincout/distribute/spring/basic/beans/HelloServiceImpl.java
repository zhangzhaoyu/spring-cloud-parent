package cn.cincout.distribute.spring.basic.beans;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by zhaoyu on 18-7-12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        log.info("hello {}", name);
        return "hello " + name;
    }
}
