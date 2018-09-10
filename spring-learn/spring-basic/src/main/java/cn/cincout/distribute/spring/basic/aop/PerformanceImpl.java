package cn.cincout.distribute.spring.basic.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-9-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@Slf4j
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        log.info("do performing...");
    }
}
