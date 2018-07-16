package cn.cincout.distribute.springboot.web.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.AsyncContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhaoyu on 18-7-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class AsyncTask implements Runnable {
    private AsyncContext asyncContext;

    public AsyncTask(AsyncContext asyncContext) {
        this.asyncContext = asyncContext;
    }

    @Override
    public void run() {
        try {
            log.info("async task begin");
            TimeUnit.SECONDS.sleep(5);
            log.info("Async Task sleep 5 seconds");

            PrintWriter writer = asyncContext.getResponse().getWriter();
            writer.write("Async Task is done \n");
            writer.flush();
            // writer.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

        asyncContext.complete();
    }
}
