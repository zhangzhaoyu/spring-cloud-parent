package cn.cincout.distribute.spring.basic.aop.counter;

import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-9-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class TrackCounter {
    private Map<String, Integer> trackCounters = new HashMap<>();

    @Pointcut("execution(**.playTrack(int))&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {}
}
