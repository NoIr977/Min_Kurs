package smallJavaExcercise1;

public class time {
    public static void main(String[] args) {
        System.out.println(" Övning 3");

        int hour = 24;
        int minuts = 60;
        int sec = 3600;

        minuts = hour * minuts;
        sec = hour * sec;
        System.out.println("the ime is: " + minuts + " minuts and " + sec + " sec");

/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int hours = scanner.nextInt();

        int minutes = hours * 60;
        int seconds = hours * 3600;

        System.out.println(hours + " часов = " + minutes + " минут");
        System.out.println(hours + " часов = " + seconds + " секунд");

        scanner.close();


 */
    }
}
