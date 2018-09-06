package cn.cincout.distribute.spring.basic.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.util.Assert;

import java.beans.Introspector;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class CustomAnnotationBeanNameGenerator extends AnnotationBeanNameGenerator {
    @Override
    protected String buildDefaultBeanName(BeanDefinition definition) {
        String beanClassName = definition.getBeanClassName();
        Assert.state(beanClassName != null, "No bean class name set");
        // String shortClassName = ClassUtils.getShortName(beanClassName);
        return Introspector.decapitalize(beanClassName);
    }
}
