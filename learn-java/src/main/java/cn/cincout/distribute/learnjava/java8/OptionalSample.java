package cn.cincout.distribute.learnjava.java8;

import lombok.Data;

import java.util.Optional;

/**
 * Created by zhaoyu on 19-1-18.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class OptionalSample {

    public Optional<Person> findMan(String name) {
        return Optional.of(null);
    }

    public static void main(String[] args) {
        Optional<Person> result = new OptionalSample().findMan("zhang");
        Person person = result.get();
        System.out.println(person.toString());
    }
}
@Data
class Person {
    private Son son;
}

class Son {
    private Dog dog;
}
class Dog {

}
