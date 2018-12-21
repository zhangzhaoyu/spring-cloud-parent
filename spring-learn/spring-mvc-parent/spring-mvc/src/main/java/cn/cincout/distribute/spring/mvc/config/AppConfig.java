package cn.cincout.distribute.spring.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zhaoyu on 18-9-14.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
@EnableWebMvc
@ComponentScan("cn.cincout.distribute.spring.mvc")
public class AppConfig {
}
