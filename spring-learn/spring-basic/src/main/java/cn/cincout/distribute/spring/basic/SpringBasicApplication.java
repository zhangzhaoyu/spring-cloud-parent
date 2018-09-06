package cn.cincout.distribute.spring.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBasicApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		SecurityManager securityManager = System.getSecurityManager();
		System.out.println(securityManager);
	}
}
