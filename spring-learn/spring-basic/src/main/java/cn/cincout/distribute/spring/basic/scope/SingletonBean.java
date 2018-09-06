package cn.cincout.distribute.spring.basic.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * Created by zhaoyu on 18-7-19.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
public class SingletonBean implements DisposableBean {
    @Resource
    private PrototypeBean prototypeBean;

    @Override
    public void destroy() throws Exception {
        prototypeBean.hello("tramp");
    }
}
