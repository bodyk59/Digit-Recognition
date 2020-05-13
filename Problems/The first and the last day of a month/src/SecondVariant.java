import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
public class SecondVariant {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), 1);
        System.out.println(date + " " + date.plusMonths(1).minusDays(1));
    }
}