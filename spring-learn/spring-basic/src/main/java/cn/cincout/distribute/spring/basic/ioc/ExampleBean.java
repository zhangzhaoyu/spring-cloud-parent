package cn.cincout.distribute.spring.basic.ioc;

import cn.cincout.distribute.spring.basic.beans.Dog;
import org.springframework.beans.factory.annotation.Required;

import java.beans.ConstructorProperties;

/**
 * Created by zhaoyu on 18-7-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class ExampleBean {
    private int years;
    private String ultimateAnswer;

    private Dog dog;

    @ConstructorProperties({"years", "ultimateAnswer"}) // for inject by constructor name
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    // to mark the dog required
    @Required
    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
