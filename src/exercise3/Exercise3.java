package exercise3;

public class Exercise3 {
    public static void main(String[] args) {

      /*
Skriv ut alla tal ifrån 1-100

Skriv ut alla jämna tal ifrån 1-100

Skriv ut alla fibonnacci-tal ifrån 1-100. Fibonnacci-tal är de två senaste talen adderat och börjar med 1, 1 som första två tal. Exempel: 1, 1, 2, 3, 5, 8, 13, 21…

 */
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("alla tal ifrån 1-100: ");
        System.out.println(" ");
       int tal = 1;
        while (tal <=100){
            System.out.print(tal + " ");
            tal = tal + 1;
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("alla jämna tal ifrån 1-100: ");
        System.out.println(" ");
        int jtal = 2;
        while (jtal<=100){
            System.out.print(jtal + " ");
            jtal = (jtal+2);
            jtal = jtal++;
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("fibonnacci-tal ifrån 1-100: ");
        System.out.println(" ");
        int number = 1;

        System.out.print(number + " ");

        int nextNumber = 1;

        while (nextNumber<=100){
            System.out.print(nextNumber + " ");
           int third = number + nextNumber;
           number = nextNumber;
           nextNumber = third;
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("The end :) ");
    }
}
