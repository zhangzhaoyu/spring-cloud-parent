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
public class AnnotationPropertySourceService {
    @Autowired
    private Environment environment;

    @Value("${application.name}")
    private String applicationName;

    @PostConstruct
    public void postConstruct() {
        System.out.println("env is " + environment);
        System.out.println("@PropertySource key " + environment.getProperty("application.name"));

        System.out.println("@Value is " + applicationName);
    }
}
