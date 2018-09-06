package cn.cincout.distribute.spring.basic.source;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zhaoyu on 18-8-8.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@Slf4j
public class DataLoader implements ResourceLoaderAware {
    private final static String dataPath = "classpath:env.properties";

    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @PostConstruct
    public void postConstruct() throws IOException {
        log.info("resource loader type : {}", resourceLoader.getClassLoader().getClass().getName());
        Resource resource = resourceLoader.getResource(dataPath);
        log.info("resource type {}", resource.getClass().getName());
        // String data = FileCopyUtils.copyToString(new FileReader(resource.getFile()));
        String data = FileCopyUtils.copyToString(new InputStreamReader(resource.getInputStream()));
        log.info("file data {}", data);
    }
}
