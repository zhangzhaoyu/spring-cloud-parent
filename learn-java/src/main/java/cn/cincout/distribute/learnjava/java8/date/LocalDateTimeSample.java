package cn.cincout.distribute.learnjava.java8.date;

import java.time.Instant;
import java.time.LocalDate;

/**
 * Created by zhaoyu on 2019-01-20 4:08 PM.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class LocalDateTimeSample {

    public static long currentTime() {
        return Instant.now().toEpochMilli();
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2018-11-09");
        System.out.println(localDate.toString());

        System.out.println(currentTime());
    }
}
