package exercise1;

public class Exercise1 {

    public static void main(String[] args) {

        /*Skapa ett program som använder tre tal
        Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.
*/
        System.out.println("First exercise is to ");
        int number = 3;
        int nextNumber = 6;
        int third = 4;

        int sum  = number+nextNumber+third;
        int median = sum/3;
        System.out.println("The sum is: " +sum);
        System.out.println("The median is: " +median);

         /*
        Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in.*/

        System.out.println();
        System.out.println("Second exercise is: ");

        int height = 3;
        int length = 5;

        int area = height * length;
        int circ = height*2 + length*2;

        System.out.println("The area is: " +area);
        System.out.println("The circ is: " +circ);



    }
}
