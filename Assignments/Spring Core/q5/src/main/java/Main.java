import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
      ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        resource r= (resource) context.getBean("re",resource.class);
        System.out.println(r);
    }
    
}
