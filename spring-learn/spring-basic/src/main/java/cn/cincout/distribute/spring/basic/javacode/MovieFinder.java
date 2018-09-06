package cn.cincout.distribute.spring.basic.javacode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-8-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component("movieFinder1")
@Slf4j
public class MovieFinder {

    // default shutdown callback function for java code config
    public void close() {
        log.info("close was called.");
    }
}
