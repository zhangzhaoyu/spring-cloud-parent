package cn.cincout.distribute.springenv.one.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by zhaoyu on 18-9-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
@ComponentScan(basePackages = {"cn.cincout.distribute.springenv.one"})
@ImportResource(locations = {"classpath:application-context.xml"})
public class AppConfig {
    //@Bean
    public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer =
                new PropertyPlaceholderConfigurer();
        ClassPathResource classPathResource = new ClassPathResource("propertyPlaceholderConfigurer.properties");
        propertyPlaceholderConfigurer.setLocations(classPathResource);
        propertyPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        return propertyPlaceholderConfigurer;
    }

    // @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        ClassPathResource classPathResource = new ClassPathResource("propertySourcesPlaceholderConfigurer.properties");
        propertySourcesPlaceholderConfigurer.setLocations(classPathResource);
        propertySourcesPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        return propertySourcesPlaceholderConfigurer;
    }

}
