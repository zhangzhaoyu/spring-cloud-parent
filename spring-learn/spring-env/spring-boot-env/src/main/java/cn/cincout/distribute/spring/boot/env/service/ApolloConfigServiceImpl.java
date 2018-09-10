package cn.cincout.distribute.spring.boot.env.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-9-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@Slf4j
public class ApolloConfigServiceImpl implements ApolloConfigService {

    @Value("${apollo.string}")
    private String apolloString;

    @Value("${apollo.int}")
    private int apolloInt;

    @PostConstruct
    public void postConstruct() {
        log.info("apolloString is {}, apolloInt is {}", apolloString, apolloInt);
    }

    @Override
    public Map<String, String> getApolloConfigValue() {
        Map<String, String> result = new HashMap<>();
        result.put("apolloString", apolloString);
        result.put("apolloInt", String.valueOf(apolloInt));
        return result;
    }
}
