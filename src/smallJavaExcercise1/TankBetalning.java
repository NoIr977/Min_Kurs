package smallJavaExcercise1;

import java.util.Scanner;

public class TankBetalning {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Write the amount of liters in liters: ");
        int liters = scanner1.nextInt();

        System.out.print("Write the price in sek: ");
        int pris = scanner1.nextInt();

        int sum = liters * pris;
        System.out.println("the price in sek before discount: " + sum + " sek");

        System.out.print("Write the discount in %: ");
        int rabatt = scanner1.nextInt();

        if(rabatt <=0) {
            System.out.println("You should pay: "+ sum + " sek");
        }
        else{
        int discount = rabatt *sum /100;
        int price = sum - discount;
            System.out.println("the price in sek with a discount: " + price + " sek");
    }


        scanner1.close();
    }
}
