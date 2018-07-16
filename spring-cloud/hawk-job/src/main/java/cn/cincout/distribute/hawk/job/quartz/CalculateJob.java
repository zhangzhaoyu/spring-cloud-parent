package cn.cincout.distribute.hawk.job.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by zhaoyu on 18-7-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class CalculateJob extends QuartzJobBean {
    private static int i = 1;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        i++;
        log.info("result is {}", i);
    }
}
