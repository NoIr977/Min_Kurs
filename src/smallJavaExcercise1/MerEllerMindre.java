package smallJavaExcercise1;

import java.util.Scanner;

public class MerEllerMindre {
    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Write the first number here: ");
        int number = scanner2.nextInt();

        System.out.print("Write the second number here: ");
        int number2 = scanner2.nextInt();

        if (number >= number2){
            System.out.println("The highest number is " + number);
        }else {
            System.out.println("The highest number is " + number2);
        }

        scanner2.close();
    }
}
