package cn.cincout.distribute.hawk.http;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by zhaoyu on 18-7-5.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class HttpUtil {
    public static CloseableHttpClient createHttpClient() {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        return httpClient;
    }

    public static void doGet(String url) {
        CloseableHttpClient httpClient =
                createHttpClient();
        HttpGet httpGet = new HttpGet(url);
        try {
            CloseableHttpResponse response = httpClient.execute(httpGet);
            log.info("-------------------------------------------");
            log.info(response.getStatusLine().toString());
            log.info(EntityUtils.toString(response.getEntity()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        doGet("https://www.12306.cn");
        // HttpsUtil.doGet("https://www.baidu.com");
    }
}
