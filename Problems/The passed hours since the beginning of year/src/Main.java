import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime currentDate = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime startOfTheYear = LocalDateTime.of(currentDate.getYear(), 1, 1, 0, 0);
        System.out.println(Duration.between(startOfTheYear, currentDate).toHours());
    }
}