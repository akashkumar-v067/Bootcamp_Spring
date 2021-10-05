package Bootcamp_Spring_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
        Dslr obj=context.getBean(Dslr.class);
        //go to Dslr class
        obj.confiq();

    }
}
