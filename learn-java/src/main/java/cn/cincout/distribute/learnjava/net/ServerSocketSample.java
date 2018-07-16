package cn.cincout.distribute.learnjava.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by zhaoyu on 18-6-21.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class ServerSocketSample {
    private final static int port = 8888;

    public static void main(String[] args)  {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try (Socket socket = serverSocket.accept()) {
                OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
                writer.write(new Date().toString() + "\r\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
