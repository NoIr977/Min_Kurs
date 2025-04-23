package smallJavaExcercise1;

import java.util.Scanner;

public class MerEllerMindre3 {
    public static void main(String[] args) {
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Write the number here: ");
        int number1 = scanner4.nextInt();

        System.out.print("Write the second number here: ");
        int number2 = scanner4.nextInt();

        if(number1%number2==0){
            System.out.println("The number is equal");
        }else{
            System.out.println("Try again");
        }
    }
}
