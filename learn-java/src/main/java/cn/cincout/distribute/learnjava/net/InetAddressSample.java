package cn.cincout.distribute.learnjava.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by zhaoyu on 18-6-27.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class InetAddressSample {

    public static void getHostname(String ip) {
        try {
            InetAddress address = InetAddress.getByAddress(new byte[]{(byte) 199, 27, (byte) 145, 65});
            System.out.println(address.getCanonicalHostName());
            System.out.println(address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void getLocalHost() {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
            System.out.println(address.getHostName());
            System.out.println(address.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void getAddress(String host) {
        try {
            InetAddress inetAddress = InetAddress.getByName(host);
            System.out.println(inetAddress);
            System.out.println(inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void getAllAddress(String host) {
        try {
            InetAddress[] inetAddresses = InetAddress.getAllByName(host);
            for (InetAddress inetAddress : inetAddresses) {
                System.out.println(inetAddress);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getAddress("www.baidu.com");
        getAddress("oreilly.com");
        getAllAddress("tramp.cincout.cn");
        getLocalHost();
        getHostname("199.27.145.65");
    }
}
