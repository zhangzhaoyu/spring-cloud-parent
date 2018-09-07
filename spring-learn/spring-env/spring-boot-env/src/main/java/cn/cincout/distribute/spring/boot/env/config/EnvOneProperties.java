package cn.cincout.distribute.spring.boot.env.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-9-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@PropertySource(value = "classpath:envone.properties")
public class EnvOneProperties {

}
