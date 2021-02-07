package assignments.spring.q4;

import org.springframework.beans.factory.annotation.Autowired;

public class autowired {

    String name;

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    // public autowired(String name) {
    //     this.name = name;
    // }

    @Override
    public String toString() {
        return "autowired [name=" + name + "]";
    }
    
    
    
}
