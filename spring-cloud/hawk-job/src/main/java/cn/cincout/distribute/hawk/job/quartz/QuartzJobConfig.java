package cn.cincout.distribute.hawk.job.quartz;

import org.quartz.JobDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.quartz.SchedulerFactoryBeanCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-7-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
public class QuartzJobConfig implements SchedulerFactoryBeanCustomizer {

    /*@Bean("printHelloJobDetail")
    public JobDetailFactoryBean printHelloJobDetail() {
        JobDetailFactoryBean detailFactoryBean = new JobDetailFactoryBean();
        detailFactoryBean.setJobClass(PrintHelloJob.class);
        detailFactoryBean.setGroup("QUARTZ");
        detailFactoryBean.setName("print-hello");

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("jobName", "printHelloJobDetail");
        detailFactoryBean.setJobDataAsMap(dataMap);
        detailFactoryBean.setDurability(true);
        detailFactoryBean.setBeanName("print-hello");
        return detailFactoryBean;
    }

    @Bean(name = "printHelloTrigger")
    public CronTriggerFactoryBean cronTriggerFactoryBean(@Qualifier("printHelloJobDetail") JobDetail jobDetail) {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setGroup("QUARTZ");
        cronTriggerFactoryBean.setName("print-hello");
        cronTriggerFactoryBean.setJobDetail(jobDetail);
        cronTriggerFactoryBean.setCronExpression("0 *1 * * * ?");

        return cronTriggerFactoryBean;
    }

    @Bean("calculateJob")
    public JobDetailFactoryBean calculateJob() {
        JobDetailFactoryBean detailFactoryBean = new JobDetailFactoryBean();
        detailFactoryBean.setJobClass(CalculateJob.class);
        detailFactoryBean.setGroup("CAL");
        detailFactoryBean.setName("calculate-job");
        detailFactoryBean.setDurability(true);
        return detailFactoryBean;
    }

    @Bean("calculateJobTrigger")
    public SimpleTriggerFactoryBean calculateJobTrigger(@Qualifier("calculateJob") JobDetail jobDetail) {
        SimpleTriggerFactoryBean triggerFactoryBean = new SimpleTriggerFactoryBean();
        triggerFactoryBean.setGroup("CAL");
        triggerFactoryBean.setName("calculate-job");
        triggerFactoryBean.setJobDetail(jobDetail);

        triggerFactoryBean.setStartDelay(1000L);
        triggerFactoryBean.setRepeatInterval(5000L);
        return triggerFactoryBean;
    }
*/

    @Bean(name = "printJobStar")
    public MethodInvokingJobDetailFactoryBean printJobStar(@Qualifier("printStarJob") PrintStarJob printStarJob) {
        MethodInvokingJobDetailFactoryBean jobDetailFactoryBean =
                new MethodInvokingJobDetailFactoryBean();
        jobDetailFactoryBean.setGroup("STAR");
        jobDetailFactoryBean.setName("star");
        System.out.println(printStarJob);
        jobDetailFactoryBean.setTargetObject(printStarJob);
        jobDetailFactoryBean.setConcurrent(false);
        jobDetailFactoryBean.setTargetMethod("printStar");

        return jobDetailFactoryBean;
    }

    @Bean("printStarTrigger")
    public SimpleTriggerFactoryBean printStarTrigger(MethodInvokingJobDetailFactoryBean jobDetail) {
        SimpleTriggerFactoryBean triggerFactoryBean = new SimpleTriggerFactoryBean();
        triggerFactoryBean.setGroup("STAR");
        triggerFactoryBean.setName("star");
        triggerFactoryBean.setJobDetail(jobDetail.getObject());

        triggerFactoryBean.setStartDelay(1000L);
        triggerFactoryBean.setRepeatInterval(5000L);
        return triggerFactoryBean;
    }

    /*@Bean(name = "printStarTrigger")
    public CronTriggerFactoryBean printStarTrigger(@Qualifier("printJobStar") JobDetail jobDetail) {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setGroup("STAR");
        cronTriggerFactoryBean.setName("star");
        cronTriggerFactoryBean.setJobDetail(jobDetail);
        cronTriggerFactoryBean.setCronExpression("0 *1 * * * ?");
        return cronTriggerFactoryBean;
    }
*/
    @Override
    public void customize(SchedulerFactoryBean schedulerFactoryBean) {
        // TODO
    }
}
