package cn.cincout.distribute.spring.boot.env;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "cn.cincout.distribute.springenv.one", "cn.cincout.distribute.spring.boot.env"})
public class SpringBootEnvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEnvApplication.class, args);
	}
}
