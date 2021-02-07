package assignments.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class value {

    @Value("20")
    int x;

    @Override
    public String toString() {
        return "value [x=" + x + "]";
    }
    
}
