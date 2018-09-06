package cn.cincout.distribute.spring.basic.beans;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class DogCreateFactory {

    public static Dog createDog() {
        return new Dog();
    }

    public Dog noStaticCreateDog() {
        return new Dog();
    }
}
