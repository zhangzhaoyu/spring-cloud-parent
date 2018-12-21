package cn.cincout.distribute.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-9-20.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"", "/"})
    @ResponseBody
    public Map<String, String> home() {
        Map<String, String> result = new HashMap<>();
        result.put("status", "success");
        return result;
    }
}
