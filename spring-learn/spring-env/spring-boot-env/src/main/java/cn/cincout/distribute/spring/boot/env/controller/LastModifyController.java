package cn.cincout.distribute.spring.boot.env.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-9-20.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Controller
@RequestMapping("/data")
public class LastModifyController extends AbstractController implements LastModified {
    static Map<String, Long> data = new HashMap<>();
    private long lastModified = System.currentTimeMillis();

    @Override
    public long getLastModified(HttpServletRequest httpServletRequest) {
        //时间戳逻辑，返回最后修改时间，例如
        if (lastModified == 0L) {
            lastModified = System.currentTimeMillis();
        }
        System.out.println("时间戳："+lastModified);
        return lastModified;

    }

    public Map<String, Long> getData() {
        return data;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView vm = new ModelAndView();
        return new ModelAndView();
    }
}
