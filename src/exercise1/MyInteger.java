package exercise1;

public class MyInteger {


    public static void main(String[] args) {
        int number = 5;
        int nextNumber = 6;

        System.out.println(number);
        System.out.println(nextNumber);


        nextNumber = number + 1;
        number = 5 + 3;
        System.out.println();
        System.out.println("NOW UPDATED TO: ");
        System.out.println(number);
        System.out.println(nextNumber);

        System.out.println();
        System.out.println("NOW UPDATED TO: ");
        //number = number + 3
        number += 3;

        System.out.println(number);
        //netNumber = nextNumber - 2
        nextNumber -= 2;
        System.out.println(nextNumber);

        System.out.println();
        System.out.println("NOW UPDATED TO: ");
        //ökar med 1 number = number+1

        number++;
        System.out.println(number);

        //Sänker med 1 dvs nextNumber = nextNumber - 1;
        nextNumber--;
        System.out.println(nextNumber);

    }
}
