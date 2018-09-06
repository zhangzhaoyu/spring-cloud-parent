package cn.cincout.distribute.spring.basic.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 18-7-20.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Component
public class AwareLifecycleBean implements ApplicationContextAware, BeanNameAware,
        ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware, ResourceLoaderAware {

    private ApplicationContext applicationContext;
    private ApplicationEventPublisher applicationEventPublisher;
    private ClassLoader classLoader;
    private BeanFactory beanFactory;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
