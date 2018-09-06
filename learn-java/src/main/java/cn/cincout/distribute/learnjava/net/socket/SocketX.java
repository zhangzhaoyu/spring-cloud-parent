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
public class SocketX implements Closeable {
    @Override
    public void close() throws IOException {
        log.info("Socket close method was called");
    }

    public InputStream getInputStream() throws IOException {
        return new InputStream();
    }
}
