package cn.cincout.distribute.hawk.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-7-5.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RestController
@Slf4j
public class HomeController {

    @GetMapping(value = "hello")
    public String hello() {
        return "world";
    }

    @GetMapping(value = "/")
    public Map<String, Object> home() {
        Map<String, Object> result = new HashMap<>();
        result.put("hello", "world");
        return result;
    }
}
