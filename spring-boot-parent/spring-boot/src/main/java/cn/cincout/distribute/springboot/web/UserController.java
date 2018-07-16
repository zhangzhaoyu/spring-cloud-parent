package cn.cincout.distribute.springboot.web;

import cn.cincout.distribute.springboot.application.UserService;
import cn.cincout.distribute.springboot.domain.User;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * Created by zhaoyu on 18-6-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/user")
    public Flux<User> list() {
        return userService.list();
    }

    @GetMapping("/user/{id}")
    public Mono<User> getById(@PathVariable("id") int id) {
        return userService.getById(id);
    }

    @PostMapping("/user")
    public Mono<User> create(@RequestBody final User user) {
        Objects.requireNonNull(user);
        return userService.createOrUpdate(user);
    }

    @PutMapping("/user/{id}")
    public Mono<User> update(@PathVariable("id") int id, @RequestBody final User user) {
        Objects.requireNonNull(user);
        user.setId(id);
        return userService.createOrUpdate(user);
    }

    @DeleteMapping("/user/{id}")
    public Mono<User> delete(@PathVariable("id") final int id) {
        return userService.delete(id);
    }
}
