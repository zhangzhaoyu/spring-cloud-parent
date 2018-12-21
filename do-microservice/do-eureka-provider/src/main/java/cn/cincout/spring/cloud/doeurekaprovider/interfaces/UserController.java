package cn.cincout.spring.cloud.doeurekaprovider.interfaces;

import cn.cincout.spring.cloud.doeurekaprovider.domain.User;
import cn.cincout.spring.cloud.doeurekaprovider.inf.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-7-5
 * @sine 1.8
 */
@RestController
@Slf4j
public class UserController {

    @Resource
    private EurekaDiscoveryClient discoveryClient;

    @Autowired
    private UserRepository userRepository;

    // @GetMapping(value = "/users/{id}", produces = { "application/json;charset=UTF-8" })
    @GetMapping(value = "/users/{id}")
    public User findById(@PathVariable(name = "id") Integer id) {
        // ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        // log.info("host: {}, service_id: {}", serviceInstance.getHost(), serviceInstance.getServiceId());
        return userRepository.getOne(id);
    }

    @PostMapping(value = "/users")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(value = "/hello")
    public String index() {
        // ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        // log.info("host: {}, service_id: {}", serviceInstance.getHost(), serviceInstance.getServiceId());
        return "hello eureka provider";
    }
}
