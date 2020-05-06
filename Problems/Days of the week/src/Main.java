import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) {
        String[] dayOfTheWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        if (number <= 0 || number > dayOfTheWeek.length) {
            throw new IllegalArgumentException();
        }

        return dayOfTheWeek[number - 1];
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}