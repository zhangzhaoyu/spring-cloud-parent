package cn.cincout.distribute.learnjava.env;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhaoyu on 18-10-29.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class SystemEnvTest {
    public static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        String[] commonds = {"sh","-c","echo $test; export test=xxx;echo $test"};
        System.out.println("before : " + System.getenv("test"));
        RunSystemCommand(commonds, null);
        System.out.println("after : " + System.getenv("test"));
    }

    public static void RunSystemCommand(String[] command, File file) {
        if (command != null && !command.equals("")) {
            try {
                Process ps = null;
                if (file != null)
                    ps = Runtime.getRuntime().exec(command, null, file);
                else
                    ps = Runtime.getRuntime().exec(command);
                String message = loadStream(ps.getInputStream());
                String errorMeg = loadStream(ps.getErrorStream());
                System.out.println(message);
                System.out.println("-------");
                System.out.println(errorMeg);

                System.out.println("middle : " + System.getenv("test"));
                try {
                    ps.waitFor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String loadStream(InputStream in) throws IOException {
        int ptr = 0;
        in = new BufferedInputStream(in);
        StringBuffer buffer = new StringBuffer();
        while ((ptr = in.read()) != -1) {
            buffer.append((char) ptr);
        }
        return new String(buffer.toString().getBytes("ISO-8859-1"), "GBK");
    }

    public static class EnvJob implements Runnable {

        @Override
        public void run() {
            String val = System.getenv("test");
            while (true) {
                System.out.println(Thread.currentThread().getName() + " : " + val);
                try {
                    TimeUnit.SECONDS.sleep(random.nextInt() % 10);
                    String [] s = {"sh","-c"," export test=zhangx;echo $test"};
                    Runtime.getRuntime().exec(s);
                    // Runtime.getRuntime().exec("source ~/.bashrc");
                    String valx = System.getenv("test");
                    System.out.println(valx);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
