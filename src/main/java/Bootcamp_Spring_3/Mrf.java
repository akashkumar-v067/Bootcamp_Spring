package Bootcamp_Spring_3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mrf implements Tyre{
    @Override
    public void showTyre() {
        System.out.println("Mrf tyre");
    }
}
