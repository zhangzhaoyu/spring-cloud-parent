package cn.cincout.distribute.spring.boot.env.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by zhaoyu on 18-9-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@Slf4j
public class OtherJarPackagePropertiesService {
    @Autowired
    private Environment environment;

    @Value("${application.name}")
    private String applicationName;

    @Value("${envone.app}")
    private String envOneApp;

    @Value("${envone.version}")
    private String envOneVersion;

    @PostConstruct
    public void postConstruct() {
        log.info("env is " + environment);
        log.info("@PropertySource key " + environment.getProperty("application.name"));

        log.info("@Value is " + applicationName);

        log.warn("envOneApp is {}, version is {}", envOneApp, envOneVersion);
    }
}
