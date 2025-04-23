package excercise9;

public class NamnBox {
    public static void main(String[] args) {
       // String[]children = {"Mickey","Minney","Kollin","Gabby","Paul"};

        String[] children = new String[5];

        children[0] = "Mickey";
        children[1] = "Minney";
        children[2] = "Kollin";
        children[3] = "Gabby";
        children[4] = "Paul";

        /*System.out.println("The number one in our list is : " + children[1]);
        System.out.println("The number four in our list is : " + children[3]);

         */

        for(int i = 0; i<5; i++) {
            System.out.println("The name of child is: " + children[i]);
        }

        String myString = "hej på er!";

        String[] stringArray = myString.split(" ");

        for(int i = 0; i<3; i++) {
            System.out.println(stringArray[i]);
        }

    }

    }
