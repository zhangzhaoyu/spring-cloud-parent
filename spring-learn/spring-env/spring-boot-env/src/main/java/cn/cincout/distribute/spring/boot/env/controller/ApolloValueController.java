package cn.cincout.distribute.spring.boot.env.controller;

import cn.cincout.distribute.spring.boot.env.service.ApolloConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
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

    @PostMapping(value = "/test")
    public String test(ModelMap modelMap, HttpServletRequest request, @RequestBody String val) {
        System.out.println("val : " + val);
        modelMap.put("val", val);
        request.setAttribute("val", val);
        return "forward:/forward";
    }

    @PostMapping(value = "/forward")
    @ResponseBody
    public String forward(HttpServletRequest request) {
        System.out.println("forward val : " + request.getAttribute("val"));
        return "good";
    }
}
