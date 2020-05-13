import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime firstTime = LocalTime.parse(scanner.nextLine());
        LocalTime secondTime = firstTime.minusHours(scanner.nextInt()).minusMinutes(scanner.nextInt());
        System.out.println(secondTime);
    }
}