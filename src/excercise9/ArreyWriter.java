package excercise9;

import java.util.Scanner;
//Создайте программу, которая проверяет, что дата рождения и четыре последние цифры разделены дефисом. Если это не так, выведите сообщение об ошибке
public class ArreyWriter {
    public static void main(String[] args) {
        //Skapa ett program som läser in fem namn ifrån terminalen

        Scanner name = new Scanner(System.in);

        System.out.print("Please add names here: ");
        String[] pupil2 = new String[5];
        for(int i = 0; i<pupil2.length; i++) {
            pupil2 [i] = name.nextLine();
        }

        //sparar dem i en array

        System.out.println("The first name is: " + pupil2[0]);
        System.out.println("The last name  is: " + pupil2[pupil2.length-1]);




        // Skriv ut det första och sista namnet
        
    }
}
