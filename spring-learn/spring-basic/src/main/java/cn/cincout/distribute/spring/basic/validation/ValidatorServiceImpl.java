package cn.cincout.distribute.spring.basic.validation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import javax.validation.Validator;

/**
 * Created by zhaoyu on 18-8-20.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Service
@Slf4j
public class ValidatorServiceImpl implements ValidatorService, ApplicationRunner {

    @Autowired
    private Validator validator;

    @Override
    public void valid() {

    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("validator is " + validator.getClass().getName());
    }
}
