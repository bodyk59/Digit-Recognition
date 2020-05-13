import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime firstDate = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime secondDate = LocalDateTime.parse(scanner.nextLine());
        System.out.println(Duration.between(firstDate, secondDate).toHours());
    }
}