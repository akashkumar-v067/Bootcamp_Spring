package Bootcamp_Spring_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dslr {
   // @Autowired -->use this annotation for direct setter injection
    Lenses lense;

   // Constructor injection manually
    Dslr(){
         this.lense=new Portrait();
     }


    public Lenses getLense() {
        return lense;
    }

    public void setLense(Lenses lense) {
        this.lense = lense;
    }

    public void confiq(){
        System.out.println("DSLR CAMERA");
        lense.lenseMP();
    }
}
