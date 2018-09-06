package cn.cincout.distribute.spring.basic.validation;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * Created by zhaoyu on 18-8-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class JavaBeanPropertiesEditorSample {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(new Company());
        beanWrapper.setPropertyValue("name", "some company Inc");

        PropertyValue propertyValue = new PropertyValue("code", 1001);
        beanWrapper.setPropertyValue(propertyValue);

        // nest property
        BeanWrapper innerBeanWrapper = new BeanWrapperImpl(new Employee());
        innerBeanWrapper.setPropertyValue("name", "zhang");

        beanWrapper.setPropertyValue("managingDirector", innerBeanWrapper.getWrappedInstance());

        Float salary = (Float) beanWrapper.getPropertyValue("managingDirector.salary");
        System.out.println(beanWrapper.getWrappedInstance().toString());
        System.out.println(salary);

    }
}
