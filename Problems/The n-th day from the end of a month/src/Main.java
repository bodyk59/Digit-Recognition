import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int dayFromEnd = scanner.nextInt();
        LocalDate localDate = LocalDate.of(year, month, 1).plusMonths(1);
        System.out.println(localDate.minusDays(dayFromEnd));
    }
}