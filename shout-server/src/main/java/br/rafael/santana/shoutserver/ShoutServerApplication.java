package br.rafael.santana.shoutserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ShoutServerApplication {

	@Value("${service.instance.shout}")
	private String shout;

	public static void main(String[] args) {
		SpringApplication.run(ShoutServerApplication.class, args);
	}

	@RequestMapping("/")
	public String shout() {
		return "Shout! " + shout;
	}
}
