package cn.cincout.distribute.springboot.web;

import cn.cincout.distribute.springboot.hessian.HelloService;
import cn.cincout.distribute.springboot.web.vo.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by zhaoyu on 18-6-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@RestController
public class HomeController {

    @Resource(name = "sayHelloService")
    private HelloService helloService;

    @Value("${swagger.enabled}")
    private String enable;

    @GetMapping("/")
    public Mono<Message> home() {
        log.info("welcome to home..");
        Message message = Message.builder()
                .status(200).message(enable).build();
        return Mono.just(message);
    }

    @GetMapping(value = "/hello")
    public Mono<String> hello(@RequestParam(name = "name") String name) {
        String result = helloService.say(name);
        return Mono.just(result);
    }
}
