package cn.cincout.distribute.spring.basic.event;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class PersonCreatedEvent extends EntityCreatedEvent<Person> {
    public PersonCreatedEvent(Object source, Person person) {
        super(source, person);
    }

    @Override
    public String toString() {
        return "PersonCreatedEvent{" +
                "source=" + source +
                '}';
    }
}
