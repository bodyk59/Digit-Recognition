import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(LocalTime.parse(scanner.nextLine()).withSecond(0));
    }
}