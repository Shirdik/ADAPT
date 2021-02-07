package assignments.spring.q4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {
    
    @Bean(name="configBean")
    public bean config()
    {
        return new bean();
    }
}
