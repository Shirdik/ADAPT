package assignments.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.scan("assignments.spring");
        context.refresh();
        component c= context.getBean(component.class);
        c.show();

        value v= context.getBean(value.class);
        System.out.println(v);

        propertySource p=context.getBean(propertySource.class);
        System.out.println(p);

    }
    
}
