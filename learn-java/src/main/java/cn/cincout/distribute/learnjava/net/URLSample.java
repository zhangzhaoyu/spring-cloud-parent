package cn.cincout.distribute.learnjava.net;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by zhaoyu on 18-7-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */

@Slf4j
public class URLSample {
    public static void readURL(String url) {
        try {
            URL u = new URL(url);
            try (InputStream stream = u.openStream()) {
                int c;
                while ((c = stream.read()) != -1) {
                    System.out.write(c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readURL2(String url) {
        try {
            URL u = new URL(url);
            URLConnection connection = u.openConnection();
            log.info("content-type {}", connection.getContentType());
            log.info("headers {}", connection.getHeaderFields());
            log.info("encoding {}", connection.getContentEncoding());
            try (InputStream stream = connection.getInputStream()) {
                int c;
                while ((c = stream.read()) != -1) {
                    System.out.write(c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readURL2("https://www.baidu.com");
        System.out.println(Long.MAX_VALUE);
    }
}
