package excercise4;

public class ForLoop {
    public static void main(String[] args) {

       for(int i =0; i<31;i++){

            System.out.print((i+1) + " January; ");
        }

        System.out.println(" ");

        for(int i =0; i<100; i+=2) {
            System.out.print((i+2) + " ");
        }
        System.out.println(" ");
        System.out.println("fibonnacci-tal ifrån 1-100: ");
        int number = 1;

        System.out.print(number + " ");

        int nextNumber = 1;

        for (int i=0; i<10;i++){
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
