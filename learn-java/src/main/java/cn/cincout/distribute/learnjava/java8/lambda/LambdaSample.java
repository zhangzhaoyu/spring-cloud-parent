package cn.cincout.distribute.learnjava.java8.lambda;

import java.util.function.Predicate;

/**
 * Created by zhaoyu on 2019-01-21.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class LambdaSample {
    public <T> boolean compute(Predicate<T> predicate, T val) {
        return predicate.test(val);
    }

    public static void main(String[] args) {
        Predicate<Integer> judge = x -> x > 100;
        System.out.println(new LambdaSample().compute(judge, 101));
    }
}
