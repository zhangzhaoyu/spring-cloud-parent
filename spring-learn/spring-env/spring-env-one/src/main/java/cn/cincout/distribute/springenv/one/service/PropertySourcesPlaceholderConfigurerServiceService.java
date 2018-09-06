package cn.cincout.distribute.springenv.one.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by zhaoyu on 18-9-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
public class PropertySourcesPlaceholderConfigurerServiceService {
    @Autowired
    private Environment environment;

    @Value("${propertySourcesPlaceholderConfigurer}")
    public String propertySourcesPlaceholderConfigurer;

    @PostConstruct
    public void postConstruct() {
        System.out.println("propertySourcesPlaceholderConfigurer name is " + propertySourcesPlaceholderConfigurer);
        System.out.println("environment PropertySourcesPlaceholderConfigurer key " + environment.getProperty("propertySourcesPlaceholderConfigurer"));
    }
}
