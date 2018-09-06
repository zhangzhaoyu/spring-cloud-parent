package cn.cincout.distribute.spring.basic.javacode.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaoyu on 18-8-3.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Configuration
public class DefaultRepositoryConfig implements RepositoryConfig {

    @Override
    @Bean
    public AccountRepository accountRepository() {
        return new AccountRepository();
    }
}
