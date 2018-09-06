package cn.cincout.distribute.spring.basic.ioc;

import cn.cincout.distribute.spring.basic.beans.Dog;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class Foo {
    private Bar bar;
    private Baz baz;

    private Dog dog;

    public Foo(Bar bar, Baz baz) {
        log.info("call Foo constructor");
        this.bar = bar;
        this.baz = baz;
    }

    // to mark the dog required
    @Required
    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
