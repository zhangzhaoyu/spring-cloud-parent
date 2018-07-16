package cn.cincout.distribute.spring.basic.properties;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhaoyu on 18-7-16.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
@ImportResource(locations = {"classpath:/xml/properties-beans.xml"})
@Slf4j
@ToString
public class PropertiesBean implements ApplicationRunner {

    @Value("#{prop.interval}")
    private int interval;

    @Value("#{prop2.interval}")
    private int interval2;



    @Value("${app.name}")
    private String appName;

    @Value("${app.name0}")
    private String appName0;

    @Value("${app.name1}")
    private String appName1;

    @Value("${app.name2:zhang}")
    private String appName2;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("properties bean is {}", this);
    }
}
