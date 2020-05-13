import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        int year = Math.max(dateTime1.getYear(), dateTime2.getYear());
        int months = Math.max(dateTime1.getMonthValue(), dateTime2.getMonthValue());
        int day = Math.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth());
        int hour = Math.max(dateTime1.getHour(), dateTime2.getHour());
        int minutes = Math.max(dateTime1.getMinute(), dateTime2.getMinute());
        int seconds = Math.max(dateTime1.getSecond(), dateTime2.getSecond());

        return LocalDateTime.of(year, months, day, hour, minutes, seconds);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}