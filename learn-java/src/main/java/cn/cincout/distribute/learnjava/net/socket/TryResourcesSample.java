package cn.cincout.distribute.learnjava.net.socket;

import java.io.IOException;

/**
 * Created by zhaoyu on 18-8-9.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class TryResourcesSample {
    private SocketX socket;

    public static void main(String[] args) {
        new TryResourcesSample().testSocket();
    }

    public void testSocket() {
        this.socket = new SocketX();
        try (InputStream stream = this.socket.getInputStream()) {
            stream.print();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
