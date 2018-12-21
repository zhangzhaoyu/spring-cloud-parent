package cn.cincout.distribute.learnjava.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyu on 18-9-30.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class HeapOOM {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        while (true) {
            objs.add(new Object());
        }
    }
}
