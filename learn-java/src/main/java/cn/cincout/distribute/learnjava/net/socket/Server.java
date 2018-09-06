package cn.cincout.distribute.learnjava.net.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhaoyu on 18-8-9.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8889);
            log.info("server socket is ok ...");
            Socket socket = serverSocket.accept();

            InputStream in = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader);

            StringBuilder result = new StringBuilder();
            String tmp;

            while ((tmp = br.readLine()) != null) {
                result.append(tmp);
            }

            log.info("server accepted {}", result.toString());

            socket.shutdownInput();
            log.info("socket shutdown input...");

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("0000");
            printWriter.flush();
            socket.shutdownOutput();

            //关闭资源
            printWriter.close();
            outputStream.close();

            br.close();
            reader.close();
            in.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
