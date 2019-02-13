package cn.cincout.distribute.learnjava.basic.innerclass;

/**
 * Created by zhaoyu on 2019-01-31.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class Parcel5 {

    public class Inner {} {
       int id = 0;
    }

    private Destination destination = new Destination() {
        @Override
        public String readLeabel() {
            return "xxx";
        }
    };
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            public PDestination(String label) {
                this.label = label;
            }

            @Override
            public String readLeabel() {
                return this.label;
            }
        }
        return new PDestination(s);
    }

    public Destination get(int i) {
        return new AbstractDest(i) {
            @Override
            public String readLeabel() {
                return "" + i;
            }
        };
    }
}
interface Destination {
    String readLeabel();
}

abstract class AbstractDest implements Destination {
    protected int i;

    public AbstractDest(int i) {
        this.i = i;
    }
}
