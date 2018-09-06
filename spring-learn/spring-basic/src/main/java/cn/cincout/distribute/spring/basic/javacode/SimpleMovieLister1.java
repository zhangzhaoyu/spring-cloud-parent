package cn.cincout.distribute.spring.basic.javacode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 * Created by zhaoyu on 18-8-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
public class SimpleMovieLister1 {
    private MovieFinder movieFinder;
    // lazy access
    private Provider<UserService> userService;

    private FileManager fileManager;

    @Inject
    public void setMovieFinder(@Named("movieFinder1") MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Inject
    public void setUserService(Provider<UserService> userService) {
        this.userService = userService;
    }

    @Inject
    public void setFileManager(@Nullable FileManager fileManager) {
        this.fileManager = fileManager;
    }

    //
    public void shutdown() {
        log.info("shutdown was called");
    }
}
