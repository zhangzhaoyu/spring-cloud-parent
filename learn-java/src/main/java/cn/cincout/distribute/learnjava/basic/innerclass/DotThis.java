package cn.cincout.distribute.learnjava.basic.innerclass;

/**
 * Created by zhaoyu on 2019-01-31.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class DotThis {
    void f() {
        System.out.println("outer class f()");
    }

    class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner inner = new DotThis().inner();
        DotThis.Inner inner1 = dotThis.new Inner();
    }
}
