package cn.cincout.distribute.spring.boot.env.controller;

import cn.cincout.distribute.spring.boot.env.service.ApolloConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by zhaoyu on 18-9-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Controller
public class ApolloValueController {

    @Autowired
    private ApolloConfigService apolloConfigService;

    @GetMapping(value = {"", "/"})
    public String home() {
        return "index";
    }

    @GetMapping(value = "/apolloConfig")
    @ResponseBody
    public Map<String, String> getApolloValue() {
        return apolloConfigService.getApolloConfigValue();
    }
}
