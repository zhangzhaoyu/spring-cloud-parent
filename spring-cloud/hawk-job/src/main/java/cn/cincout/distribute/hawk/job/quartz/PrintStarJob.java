package cn.cincout.distribute.hawk.job.quartz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-7-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Component("printStarJob")
public class PrintStarJob {
    private static int i = 1;
    public void printStar() {
        String result = "";
        for (int j = 0; j < i; j++) {
            result += "*";
        }
        i++;
        log.info(result);
    }
}
