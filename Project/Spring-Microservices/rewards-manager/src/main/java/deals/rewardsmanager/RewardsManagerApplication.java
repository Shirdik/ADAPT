package deals.rewardsmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RewardsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsManagerApplication.class, args);
	}

}
