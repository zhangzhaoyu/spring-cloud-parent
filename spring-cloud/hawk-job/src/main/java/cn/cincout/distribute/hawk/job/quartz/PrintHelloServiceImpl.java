package cn.cincout.distribute.hawk.job.quartz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by zhaoyu on 18-7-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Component
public class PrintHelloServiceImpl implements PrintHelloService {
    @Override
    public void printHello(String target) {
        log.info("hello {}, time is {}", target, new Date().toString());
    }
}
