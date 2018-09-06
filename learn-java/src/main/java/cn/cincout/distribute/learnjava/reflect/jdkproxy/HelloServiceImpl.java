package cn.cincout.distribute.learnjava.reflect.jdkproxy;

/**
 * Created by zhaoyu on 18-8-15.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "say hello : " + name;
    }
}
