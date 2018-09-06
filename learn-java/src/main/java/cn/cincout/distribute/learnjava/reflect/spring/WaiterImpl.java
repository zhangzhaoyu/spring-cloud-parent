package cn.cincout.distribute.learnjava.reflect.spring;

/**
 * Created by zhaoyu on 18-8-15.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class WaiterImpl implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greeting to " + name);
    }

    @Override
    public void serviceTo(String name) {
        System.out.println("service to " + name);
    }
}
