package cn.cincout.distribute.springreactive.web;

import cn.cincout.distribute.springreactive.view.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by zhaoyu on 18-7-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@RestController
public class HomeController {
    @GetMapping("/hello")
    public Mono<Message> hello() {
        return Mono.just(new Message(HttpStatus.OK.value(), "success"));
    }
}
