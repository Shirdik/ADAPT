package login.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AuthApplication {

	// @Bean
	// public RestTemplate RestTemplateBuilder() {
	// return RestTemplate;
	// }

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

}
