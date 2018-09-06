package cn.cincout.spring.cloud.eurekaserver.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-3-6.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RestController
public class HomeController {
    @GetMapping(value = "/home")
    public Map<String, Object> home() {
        Map<String, Object> result = new HashMap<>();
        result.put("hello", "eureka");
        return result;
    }
}
