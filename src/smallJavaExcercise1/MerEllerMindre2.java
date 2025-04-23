package smallJavaExcercise1;

import java.util.Scanner;

public class MerEllerMindre2 {
    public static void main(String[] args) {

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Write the first number here: ");
        int number = scanner3.nextInt();

        System.out.print("Write the second number here: ");
        int number2 = scanner3.nextInt();

        if((number/2)>=number2){
            System.out.println("too big");
        }else{
            System.out.println("The number is " + number );
        }
    }
}
