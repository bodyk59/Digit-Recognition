import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate firstDay = LocalDate.of(year, month, 1);

        while (firstDay.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstDay = firstDay.plusDays(1);
        }

        while (firstDay.getMonthValue() == month) {
            System.out.println(firstDay);
            firstDay = firstDay.plusWeeks(1);
        }
    }
}