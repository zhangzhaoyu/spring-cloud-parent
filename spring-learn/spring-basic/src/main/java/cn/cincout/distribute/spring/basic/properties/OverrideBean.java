package cn.cincout.distribute.spring.basic.properties;

import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * Created by zhaoyu on 18-7-24.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Setter
@ToString
@Slf4j
public class OverrideBean implements ApplicationRunner {
    private String name;
    private int interval;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info(this.toString());
    }
}
