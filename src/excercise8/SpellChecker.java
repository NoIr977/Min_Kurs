package excercise8;

public class SpellChecker {

    //Skapa en metod som heter isLetter(char sign) som kontrollerar om ett tecken (sign) är en engelsk bokstav (a-z)


    public static boolean isLetter(char sign) {
        //return Character.isLetter(sign);

       boolean isLetter = true;

            if (sign >= 'a' && sign <= 'z') {
                isLetter = true;
            }else{
                isLetter = false;
            }
            return isLetter;
        }
       }







   // Denna metod returnerar true om tecknet är en engelsk bokstav annars false

