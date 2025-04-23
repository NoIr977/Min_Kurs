package exercise2;

public class Övning1 {
    public static void main(String[] args) {

        int number1 = 24;
        int number2 = 12;

       if (number1 > number2){
            System.out.println("Första talet är störst");
        }else if (number1 < number2){
            System.out.println("Andra talet är störst");
        }

        System.out.println("Övning2 ");

        if (number1%number2 == 0) {
            System.out.println("Jämt delbart");
        }
        else{
            System.out.println("Inte jämt delbart");
        }
    }
}
