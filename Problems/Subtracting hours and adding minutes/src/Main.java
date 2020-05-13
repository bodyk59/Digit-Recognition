import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine())
                .minusHours(scanner.nextInt())
                .plusMinutes(scanner.nextInt());
        System.out.println(localDateTime);
    }
}