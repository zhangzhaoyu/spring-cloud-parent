package cn.cincout.distribute.spring.boot.env.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
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
public class ApolloConfigService {

    @Value("${apollo.string}")
    private String apolloString;

    @Value("${apollo.int}")
    private int apolloInt;

    @PostConstruct
    public void postConstruct() {
        log.info("apolloString is {}, apolloInt is {}", apolloString, apolloInt);
    }

}
