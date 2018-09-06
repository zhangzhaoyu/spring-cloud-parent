package cn.cincout.distribute.spring.basic.javacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaoyu on 18-8-1.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
public class JavaCodeConfig {
    @Bean
    /**
     * @Bean can not be private or final, must can be override method
     */
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public SimpleMovieLister1 simpleMovieLister1() {
        return new SimpleMovieLister1();
    }
}
