package cn.cincout.distribute.learnjava.jvm;

/**
 * Created by zhaoyu on 18-10-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class ReferenceCountingGC {
    public ReferenceCountingGC instance;

    private byte[] bigSize=  new byte[1024 * 1024];

    public static void main(String[] args) {
        ReferenceCountingGC a = new ReferenceCountingGC();
        ReferenceCountingGC b = new ReferenceCountingGC();
        a.instance = b;
        b.instance = a;

        a = null;
        b = null;
        System.gc();
    }
}
