package cn.cincout.distribute.spring.basic.javacode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-8-1.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class UserServiceImpl implements UserService {
    // default shutdown callback function for java code config, the function name is close or shutdown
    // we can close the function by @Bean(destroyMethod="")
    public void close() {
        log.info("close was called.");
    }
}
