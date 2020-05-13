import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate currentDate = LocalDate.parse(scanner.next());
        int daysToNewYear = scanner.nextInt();
        LocalDate nextDate = currentDate.plusDays(daysToNewYear);

        System.out.println(nextDate.getYear() > currentDate.getYear());
    }
}