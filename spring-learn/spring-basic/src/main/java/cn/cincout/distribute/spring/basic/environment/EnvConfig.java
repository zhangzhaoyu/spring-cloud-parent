package cn.cincout.distribute.spring.basic.environment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by zhaoyu on 18-8-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
@PropertySource("classpath:env.properties")
@Slf4j
public class EnvConfig {
    @Autowired
    private Environment environment;

    @Value("${job.name}")
    private String jobName;

    @Bean
    public TestEnvBean testEnvBean() {
        log.info("env prop: " + environment.getProperty("job.name") + ", @Value('job.name')" + jobName);
        return new TestEnvBean();
    }
}
