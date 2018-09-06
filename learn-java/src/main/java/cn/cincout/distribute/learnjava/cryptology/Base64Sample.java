package cn.cincout.distribute.learnjava.cryptology;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

/**
 * Created by zhaoyu on 18-7-19.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class Base64Sample {
    public static String base64Encoder(String text) {
        try {
            return Base64.getEncoder().encodeToString(text.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(Arrays.toString("zhang".getBytes("GB2312")));
        System.out.println(Arrays.toString("zhang".getBytes("UTF-8")));
    }

}
