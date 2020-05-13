import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

/**
 * @author Bogdan Kurchak
 */
public class SecondVariant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate date = firstWeekdayInMonth(DayOfWeek.MONDAY, year, month);
        LocalDate next = date;

        while (next.getMonth() == date.getMonth()) {
            System.out.println(next);
            next = next.plusWeeks(1);
        }
    }

    public static LocalDate firstWeekdayInMonth(DayOfWeek day, int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        int offset = (day.getValue() + 7 - date.getDayOfWeek().getValue()) % 7;
        return date.plusDays(offset);
    }
}

