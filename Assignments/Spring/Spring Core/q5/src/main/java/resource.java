import javax.annotation.Resource;


public class resource {
    String name;

    public String getName() {
        return name;
    }

    @Resource(name="re")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "resource [name=" + name + "]";
    }


    
}
