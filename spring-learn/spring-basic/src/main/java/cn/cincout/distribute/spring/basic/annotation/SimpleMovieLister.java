package cn.cincout.distribute.spring.basic.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoyu on 18-7-27.
 * As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
 * no longer necessary if the target bean only defines one constructor to begin with.
 * However, if several constructors are available, at least one must be annotated to
 * teach the container which one to use.
 * @author zhaoyu
 * @sine 1.8
 */
@Service
public class SimpleMovieLister {
    private MovieFinder movieFinder;

    // @Autowired can be removed
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
}
