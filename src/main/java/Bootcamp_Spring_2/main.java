package Bootcamp_Spring_2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    static Calculater cal;
    public static void main(String[] args) {
        ApplicationContext appcon=new AnnotationConfigApplicationContext(Appconfig.class);
        Calculater obj=appcon.getBean(Sum.class);
        System.out.println(obj.calculate(15,25));


    }
}
