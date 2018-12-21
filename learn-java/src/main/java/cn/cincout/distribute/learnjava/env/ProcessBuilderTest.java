package cn.cincout.distribute.learnjava.env;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by zhaoyu on 18-11-13.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class ProcessBuilderTest {

    public static int exec(String cmd) {
        ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", cmd);
        Map<String, String> env = processBuilder.environment();
        System.out.println(env);
        processBuilder.redirectErrorStream(true);

        StringBuffer sb = new StringBuffer();
        try {
            Process process = processBuilder.start();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );

            String line;
            while (br != null && (line = br.readLine()) != null) {
                sb.append(line);
            }
            process.waitFor();

            return process.exitValue();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(sb.toString());
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(exec("ls -al"));
    }
}
