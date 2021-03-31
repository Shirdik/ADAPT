package assignments.spring.q4;

import org.springframework.stereotype.Service;

@Service("service")
public class service {

    public void show()
    {
        System.out.println("Using Service, spring can auto-detect from context");
    }
    
}
