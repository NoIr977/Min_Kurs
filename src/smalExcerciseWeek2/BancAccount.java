package smalExcerciseWeek2;

import java.util.Scanner;

public class BancAccount {
    public static void main(String[] args) {
        Banc saldo = new Banc( 350000);

        saldo.printSaldo();

        Scanner money = new Scanner(System.in);

        System.out.print("Add money to your account: ");
        int amount = money.nextInt();

        saldo.addAmount(amount);

        int sum = saldo.getSaldo();
        System.out.println("Your saldo is: " + sum + " sek");

        System.out.print("Write amount of money you want to take from youe account:  ");
        int amount2 = money.nextInt();

        saldo.withdrowAmount(amount2);

        int minus = saldo.getSaldo();
        System.out.println("Your saldo now is : " + minus + " sek");

    }
}
