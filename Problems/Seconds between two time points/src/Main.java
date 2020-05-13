import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secondsOfFirstTime = LocalTime.parse(scanner.nextLine()).toSecondOfDay();
        int secondsOfSecondTime = LocalTime.parse(scanner.nextLine()).toSecondOfDay();
        int difference = secondsOfFirstTime - secondsOfSecondTime;

        System.out.println(Math.abs(difference));
    }
}