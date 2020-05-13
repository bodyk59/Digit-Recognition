import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split("\\s+");
        LocalDateTime localDateTime = LocalDateTime.parse(date[0])
                .plusDays(Integer.parseInt(date[1]))
                .minusHours(Integer.parseInt(date[2]));
        System.out.println(localDateTime);
    }
}