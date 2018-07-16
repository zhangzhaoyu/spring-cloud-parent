package cn.cincout.distribute.learnjava.net;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

/**
 * Created by zhaoyu on 18-6-21.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class SocketClient {
    private final static String ip = "localhost";
    private final static int port =8888;

    public static void main(String[] args) {
        try (Socket socket = new Socket(ip, port)) {
            socket.setSoTimeout(15000);
           /* BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("hello");
            writer.flush();
            writer.close();*/


            InputStream inputStream = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);

            String result = "";
            /*for (int c = reader.read(); c != -1; c = reader.read()) {
                result += (char) c;
            }*/

            BufferedReader bufferedReader = new BufferedReader(reader);
            String tmp = null;
            while ((tmp = bufferedReader.readLine()) != null) {
                result += tmp;
            }

            System.out.println(result);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
