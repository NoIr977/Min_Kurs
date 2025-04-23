package smallJavaExcercise1;

import java.util.Scanner;

public class TheBodyTemperature {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Write your temperature here: ");
        int temp = scanner1.nextInt();

        if(temp>35 || temp<42) {
            System.out.println("Your temperature is: " + temp + " You need to go to the hospital");
        }else{
            System.out.println("Your temperature is: " + temp + " You may stay at home");
        }
    }
}
