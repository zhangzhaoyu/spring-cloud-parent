package cn.cincout.distribute.spring.basic.web;

import cn.cincout.distribute.spring.basic.beans.AbstractAnimal;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoyu on 18-7-16.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RestController
public class HomeController {

    @Value("${mvc.props}")
    private String mvcValue;

    @GetMapping(value = "/")
    @ApiOperation(value = "查询banner", notes = "查询banner")
    public String home() {
        return mvcValue;
    }
}
