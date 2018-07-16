package cn.cincout.distribute.springboot.hessian;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        log.info("say hell to {}", name);
        return "hello " + name;
    }
}
