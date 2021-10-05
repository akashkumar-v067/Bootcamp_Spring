package Bootcamp_Spring_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
     ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
     Honda obj=context.getBean(Honda.class);
     // we will get an error in line 9 if remove @Primary annotation from Mrf class
        //because then there will be two beans Mrf and Ceat.
     obj.show();



    }
}
