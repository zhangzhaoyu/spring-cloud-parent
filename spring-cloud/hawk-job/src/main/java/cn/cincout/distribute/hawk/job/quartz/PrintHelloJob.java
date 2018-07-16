package cn.cincout.distribute.hawk.job.quartz;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;

/**
 * Created by zhaoyu on 18-7-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class PrintHelloJob extends QuartzJobBean {

    @Resource
    private PrintHelloService printHelloService;

    @Setter
    private String jobName;
    private int i = 0;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("hello job {}, times {}", jobName, i++);
        printHelloService.printHello(jobName);
    }
}
