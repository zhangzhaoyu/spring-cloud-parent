package cn.cincout.distribute.springboot.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaoyu on 18-7-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
@ServletComponentScan(basePackages = {"cn.cincout.distribute.springboot.web.servlet"})
public class ServletConfig {

}
