package cn.cincout.distribute.spring.basic.apache;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by zhaoyu on 18-8-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class BeanPropertiesSample {
    public static void main(String[] args) {
        Object object = new Man("zhang", 12);

        try {
            Object obj = PropertyUtils.getProperty(object, "name");
            Object age = PropertyUtils.getProperty(object, "age");
            System.out.println(obj);
            System.out.println(age);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}


