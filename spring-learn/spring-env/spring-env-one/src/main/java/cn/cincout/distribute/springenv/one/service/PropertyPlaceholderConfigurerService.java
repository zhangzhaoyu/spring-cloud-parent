package cn.cincout.distribute.springenv.one.service;

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
public class PropertyPlaceholderConfigurerService {
    @Autowired
    private Environment environment;

    @Value("${propertyPlaceholderConfigurer}")
    public String propertyPlaceholderConfigurer;

    @PostConstruct
    public void postConstruct() {
        System.out.println("PropertyPlaceholderConfigurer name is " + propertyPlaceholderConfigurer);
        System.out.println("environment propertyPlaceholderConfigurer key " + environment.getProperty("propertyPlaceholderConfigurer"));
    }
}
