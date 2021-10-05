package Bootcamp_Spring_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    public Dslr getCam(){
        return new Dslr();
    }
    @Bean
    public Lenses getLense(){
        return new Portrait();
    }
}
