package cn.cincout.distribute.spring.basic.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-8-3.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RestController
@Slf4j
public class InetAddressController {

    @GetMapping("/dnsCache/{host}")
    public Map<String, Object> jdkDNSCache(@PathVariable("host") String host) {
        Map<String, Object> result = new HashMap<>();
        try {
            InetAddress inetAddress = InetAddress.getByName(host);
            result.put("HostAddress", inetAddress.getHostAddress());
            result.put("HostName", inetAddress.getHostName());
            readURL2("https://" + host);
            return result;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        result.put("error", "can not get host");
        return result;
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
}
