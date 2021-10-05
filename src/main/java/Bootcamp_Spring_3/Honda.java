package Bootcamp_Spring_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Honda {
@Autowired
    Tyre tyreName;

    public Tyre getTyreName() {
        return tyreName;
    }

    public void setTyreName(Tyre tyreName) {
        this.tyreName = tyreName;
    }
    public void show(){
        System.out.println("Honda bike");
        tyreName.showTyre();
    }
}
