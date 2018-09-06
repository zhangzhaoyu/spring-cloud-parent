package cn.cincout.distribute.learnjava.net.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by zhaoyu on 18-8-9.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class InputStream implements Closeable {
    @Override
    public void close() throws IOException {
        log.info("InputStream close method was called");
    }

    public void print() {
        log.info("Hello World from InputStream");
    }
}
