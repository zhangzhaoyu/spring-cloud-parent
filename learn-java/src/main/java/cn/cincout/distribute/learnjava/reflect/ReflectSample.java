package cn.cincout.distribute.learnjava.reflect;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class ReflectSample {
    public static void main(String[] args) {
        SubStatBo subStatBo = new SubStatBo(0, 12.34, "zhang");

        try {

            System.out.println(BeanUtils.getProperty(subStatBo, "name"));
            Object object = BeanUtils.getProperty(subStatBo, "count");
            System.out.println(object);
            System.out.println(BeanUtils.getProperty(subStatBo, "price"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
