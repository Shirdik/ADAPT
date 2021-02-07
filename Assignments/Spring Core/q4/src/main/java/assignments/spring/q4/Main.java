package assignments.spring.q4;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.scan("assignments.spring.q4");
        context.refresh();
        // service s= (service) context.getBean("service");
        service s= context.getBean(service.class);
        s.show();

        controller c=context.getBean(controller.class);
        c.show();

        configuration b= context.getBean(configuration.class);
        bean be=b.config();        
        be.show();

        ApplicationContext context2= new ClassPathXmlApplicationContext("spring.xml");
        autowired a=(autowired) context2.getBean("auto");
        System.out.println(a);

        repository r= context.getBean(repository.class);
        r.show();

    }
    
}
