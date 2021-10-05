package Bootcamp_Spring_1;

public class main {
    static Calculater cal;
    public static void main(String[] args) {
       System.out.println("for ques 3 and four");
        System.out.println("Demonstrated using tight coupled");
        //Ques-1 Write a program to demonstrate Tightly Coupled code.
        Sum obj1=new Sum();
        int sum=obj1.calculate(35,26);
        System.out.println(sum);

        Substract obj2=new Substract();
        int substract=obj2.calculate(35,26);
        System.out.println(substract);

        Multiply obj3=new Multiply();
        int multiply=obj3.calculate(35,26);
        System.out.println(multiply);

        Divide obj4=new Divide();
        int divide=obj4.calculate(50,25);
        System.out.println(divide);

        System.out.println("\nDemonstrated using loosely coupled");
        //Ques-2 Write a program to demonstrate Loosely Coupled code.
        //calculate sum
        cal=new Sum();
        System.out.println(cal.calculate(35,26));

        //calculate substract
        cal=new Substract();
        System.out.println(cal.calculate(35,26));

        //calculate multiplication
        cal=new Multiply();
        System.out.println(cal.calculate(35,26));

        //calculate divide
        cal=new Divide();
        System.out.println(cal.calculate(50,25));


    }
}
