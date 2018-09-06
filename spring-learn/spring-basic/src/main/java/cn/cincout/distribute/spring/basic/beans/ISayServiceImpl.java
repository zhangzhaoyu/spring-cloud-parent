package cn.cincout.distribute.spring.basic.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Service
public class ISayServiceImpl implements ISayService {
    @Override
    public void say(String name) {
        log.info("say {}", name);
    }
}
