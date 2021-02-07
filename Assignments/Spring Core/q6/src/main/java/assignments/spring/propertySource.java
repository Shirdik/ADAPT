package assignments.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:system.properties")
public class propertySource {

    Environment env;

    String name=env.getProperty("Value");

    @Override
    public String toString() {
        return "propertySource [name=" + name + "]";
    }

    
}
