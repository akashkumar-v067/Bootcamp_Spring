package Bootcamp_Spring_4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Portrait implements Lenses{
    int LenseRadius;
    @Override
    public void lenseMP() {
        System.out.println("Portrait: 100MP APERTURE:30");
    }
}
