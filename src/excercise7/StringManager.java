package excercise7;

public class StringManager {
    public static void main(String[] args) {

        //                 012345678
        String myString = "some text";

        if(myString.equals("some text")) {

            System.out.println("Yes the text is the same");
        }else {
            System.out.println("No the text is different");
        }

        if(myString.length()==9) {

            System.out.println("Text is exactly 9 characters");
        }

        //charAt - ger oss möjlighet att se index av bokstaver
        System.out.println(myString.charAt(3));
    }
}
