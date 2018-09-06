package cn.cincout.distribute.spring.basic.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoyu on 18-7-23.
 * use dogBean to get the dog object
 * use &dogBean to get the DogFactoryBean
 * @author zhaoyu
 * @sine 1.8
 */
@Service("dogBean")
public class DogFactoryBean implements FactoryBean<Dog> {
    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
