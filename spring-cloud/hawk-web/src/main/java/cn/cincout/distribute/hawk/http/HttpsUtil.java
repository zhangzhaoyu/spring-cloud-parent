package cn.cincout.distribute.hawk.http;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyu on 18-7-5.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class HttpsUtil {

    public static CloseableHttpClient createSSLClientDefault() {
        try {
            SSLContext sslContext = new SSLContextBuilder()
                    .loadTrustMaterial(null, new TrustStrategy() {
                        @Override
                        public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                            return true;
                        }
                    }).build();
            HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;
            SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);

            // use pool
            PoolingHttpClientConnectionManager connMgr =
                    new PoolingHttpClientConnectionManager(RegistryBuilder
                            .<ConnectionSocketFactory> create()
                            .register("http", PlainConnectionSocketFactory.getSocketFactory())
                            .register("https", sslSocketFactory)
                            .build()
                    );

            return HttpClients.custom()
                    .setSSLSocketFactory(sslSocketFactory)
                    .setConnectionManager(connMgr)
                    .build();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
        return HttpClients.createDefault();
    }

    public static void doGet(String url) {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpClient httpClient = createSSLClientDefault();
        try {
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            log.info(httpResponse.getStatusLine().toString());
            log.info(EntityUtils.toString(httpResponse.getEntity()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doPost(Map<String, Object> params, String url) {
        HttpPost httpPost = new HttpPost(url);
        List<NameValuePair> nameValuePairList = new ArrayList<>();
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                nameValuePairList.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            }
        }

        try {
            UrlEncodedFormEntity encodedFormEntity = new UrlEncodedFormEntity(nameValuePairList, "UTF-8");
            log.info("created http post url {}, params {}", url, nameValuePairList);

            httpPost.setEntity(encodedFormEntity);
            CloseableHttpClient httpClient = createSSLClientDefault();
            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            log.info(httpResponse.getStatusLine().toString());
            log.info(EntityUtils.toString(httpResponse.getEntity()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
