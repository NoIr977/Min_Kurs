package smallJavaExcercise1;

import javax.xml.transform.Source;
import java.util.Scanner;

public class TrainTime {
    public static void main(String[] args) {
        Scanner train = new Scanner(System.in);

        System.out.println("Write the departure time here: ");
        System.out.print("Hours : ");
        int hours = train.nextInt();
        System.out.print("Minutes: ");
        int minutes = train.nextInt();
        System.out.println("The departure time at: " + hours + " : " + (minutes< 10 ? "0" : "") + minutes);


        System.out.println(" ");
        System.out.println("Write the travel time here: ");
        System.out.print("Hours : ");
        int hours2 = train.nextInt();
        System.out.print("Minutes : ");
        int minutes2 = train.nextInt();
        System.out.println("The travel time is: " + hours2 + " : " + (minutes2< 10 ? "0" : "") + minutes2);

        int arrivalHours = hours + hours2;
        int arrivalMinutes = minutes + minutes2;

        if (arrivalHours >= 24) {
            arrivalHours -= 24;

        System.out.println("Arrival time: " + arrivalHours + ":" + (arrivalMinutes < 10 ? "0" : "") + arrivalMinutes + " Next day");
    }else{
        System.out.println("Arrival time: " + arrivalHours + ":" + (arrivalMinutes < 10 ? "0" : "") + arrivalMinutes);
    }
    }
}
