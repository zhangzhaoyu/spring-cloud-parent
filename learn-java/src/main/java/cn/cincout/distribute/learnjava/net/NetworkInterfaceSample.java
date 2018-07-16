package cn.cincout.distribute.learnjava.net;

import sun.nio.ch.Net;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by zhaoyu on 18-7-9.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class NetworkInterfaceSample {
    public static void getByName() {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("eth0");
            if (networkInterface != null) {
                System.out.println(networkInterface.toString());
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static void list() {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();
                System.out.println(networkInterface + networkInterface.getInterfaceAddresses().toString());
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getByName();
        list();
    }
}
