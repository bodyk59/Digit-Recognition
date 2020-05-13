import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine()).plusMinutes(scanner.nextInt());
        System.out.printf("%d %d %s",
                localDateTime.getYear(),
                localDateTime.getDayOfYear(),
                localDateTime.toLocalTime());
    }
}