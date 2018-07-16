package cn.cincout.distribute.springboot.web.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhaoyu on 18-7-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Controller
public class AsyncServlet {
    static ExecutorService executorService = Executors.newFixedThreadPool(5);

    @GetMapping("/syncServlet")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("AsyncServlet");
        AsyncContext context = req.startAsync();
        context.addListener(new AsyncServletListener());

        executorService.submit(new AsyncTask(context));
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
        PrintWriter writer = context.getResponse().getWriter();
        writer.write("Async Task doGet \n");
        writer.flush();
    }
}
