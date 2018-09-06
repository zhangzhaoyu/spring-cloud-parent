package cn.cincout.distribute.springenv.one;

import cn.cincout.distribute.springenv.one.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEnvOneApplication {

	public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
