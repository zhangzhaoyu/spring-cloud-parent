package cn.cincout.distribute.spring.basic.aop;

/**
 * Created by zhaoyu on 18-9-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class DefaultEncoreable implements Encoreable {
    @Override
    public void hello() {
        System.out.println("hello world");
    }
}
