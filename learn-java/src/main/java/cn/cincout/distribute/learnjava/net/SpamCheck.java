package cn.cincout.distribute.learnjava.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Base64;

/**
 * Created by zhaoyu on 18-7-9.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class SpamCheck {
    public static final String BLACKHOLE = "sb1.spamhaus.org";

    private static boolean isSpammer(String arg) {
        try {
            InetAddress address = InetAddress.getByName(arg);
            byte[] quad = address.getAddress();
            String query = BLACKHOLE;
            for (byte octet : quad) {
                int unsignedByte = octet < 0 ? octet + 256 : octet;
                query = unsignedByte + "." + query;
            }

            InetAddress.getByName(query);
            return true;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        if (isSpammer("207.34.56.23")) {
            System.out.println("a spammer");
        } else {
            System.out.println("appears legitimate");
        }
    }
}
