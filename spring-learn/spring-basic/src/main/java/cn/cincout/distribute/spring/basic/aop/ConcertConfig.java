package cn.cincout.distribute.spring.basic.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by zhaoyu on 18-9-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }
}
