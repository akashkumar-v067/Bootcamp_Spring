package Bootcamp_Spring_3;

import org.springframework.stereotype.Component;

@Component
public class Ceat implements Tyre{
    @Override
    public void showTyre() {
        System.out.println("Ceat tyre");
    }
}
