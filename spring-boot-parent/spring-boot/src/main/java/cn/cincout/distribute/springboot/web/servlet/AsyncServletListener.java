package cn.cincout.distribute.springboot.web.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhaoyu on 18-7-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class AsyncServletListener implements AsyncListener {
    @Override
    public void onComplete(AsyncEvent asyncEvent) throws IOException {
        log.info("onComplete");
        ServletResponse response = asyncEvent.getAsyncContext().getResponse();
        PrintWriter writer = response.getWriter();
        writer.write("from AsyncListener \n");
        writer.flush();
        writer.close();
    }

    @Override
    public void onTimeout(AsyncEvent asyncEvent) throws IOException {
        log.info("onTimeout");
    }

    @Override
    public void onError(AsyncEvent asyncEvent) throws IOException {
        log.info("onError");
    }

    @Override
    public void onStartAsync(AsyncEvent asyncEvent) throws IOException {
        log.info("onStartAsync");
    }
}
