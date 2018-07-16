package cn.cincout.distribute.hawk.job.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
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
public class PrintTimeService {
    @Scheduled(cron = "0 */1 * * * ?")
    public void printTime() {
        log.info("current time is {}", new Date().toString());
    }
}
