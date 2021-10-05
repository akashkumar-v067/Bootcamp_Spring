package Bootcamp_Spring_2;
import org.springframework.stereotype.Component;

@Component
public class Divide implements Calculater{
    @Override
    public int calculate(int x,int y){
        return (int)x/y;
    }
}
