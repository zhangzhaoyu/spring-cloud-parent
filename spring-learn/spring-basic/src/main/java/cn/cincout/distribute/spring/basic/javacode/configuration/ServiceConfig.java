package cn.cincout.distribute.spring.basic.javacode.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaoyu on 18-8-3.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
public class ServiceConfig {
    @Autowired
    private RepositoryConfig repositoryConfig;
}
