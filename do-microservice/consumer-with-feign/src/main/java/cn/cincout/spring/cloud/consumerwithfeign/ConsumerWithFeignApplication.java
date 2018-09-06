package cn.cincout.spring.cloud.consumerwithfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerWithFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerWithFeignApplication.class, args);
	}
}
