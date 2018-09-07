package cn.cincout.distribute.springenv.one.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by zhaoyu on 18-9-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
@PropertySource(value = "classpath:application-config.properties")
public class PropertiesConfig {

}
