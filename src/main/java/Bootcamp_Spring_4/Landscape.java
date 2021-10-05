package Bootcamp_Spring_4;

import org.springframework.stereotype.Component;

@Component
public class Landscape implements Lenses{
    @Override
    public void lenseMP() {
        System.out.println("Landscape: 50MP, Aperture:20");
    }
}
