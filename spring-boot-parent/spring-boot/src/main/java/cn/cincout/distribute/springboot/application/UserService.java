package cn.cincout.distribute.springboot.application;

import cn.cincout.distribute.springboot.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhaoyu on 18-6-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Service
@Slf4j
public class UserService {
    private final Map<Integer, User> data = new ConcurrentHashMap<>();

    public Flux<User> list() {
        return Flux.fromIterable(this.data.values());
    }

    public Mono<User> getById(final int id) {
        return Mono.justOrEmpty(this.data.get(id))
                .switchIfEmpty(Mono.error(new RuntimeException("resource not exist")));
    }

    public Flux<User> createOrUpdate(final Flux<User> users) {
        return users.doOnNext(user -> this.data.put(user.getId(), user));
    }

    public Mono<User> createOrUpdate(final User user) {
        this.data.put(user.getId(), user);
        return Mono.just(user);
    }

    public Mono<User> delete(final int id) {
        return Mono.justOrEmpty(this.data.remove(id));
    }
}
