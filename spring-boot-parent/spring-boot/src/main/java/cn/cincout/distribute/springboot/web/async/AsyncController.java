package cn.cincout.distribute.springboot.web.async;

import cn.cincout.distribute.springboot.web.servlet.AsyncTask;
import cn.cincout.distribute.springboot.web.vo.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhaoyu on 18-7-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RestController
@Slf4j
public class AsyncController {

    @GetMapping("/asyncMsg")
    public DeferredResult<Message> asyncMsg() {
        log.info("async controller begin");
        DeferredResult<Message> result = new DeferredResult<>();
        new Thread(new AsyncTask(result)).start();
        log.info("async controller end");
        return result;
    }

    @GetMapping("/callable")
    public Callable<Message> callable() {
        log.info("async controller begin");
        return () -> {
            log.info("AsyncTask begin");
            TimeUnit.SECONDS.sleep(3);
            log.info("AsyncTask end");
            return new Message(200, "scuuess");
        };
    }

    @Slf4j
    public static class AsyncTask implements Runnable {
        DeferredResult<Message> deferredResult;

        public AsyncTask(DeferredResult<Message> deferredResult) {
            this.deferredResult = deferredResult;
        }

        @Override
        public void run() {
            try {
                log.info("AsyncTask begin");
                TimeUnit.SECONDS.sleep(3);
                log.info("AsyncTask end");

                deferredResult.setResult(new Message(200, "success"));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
