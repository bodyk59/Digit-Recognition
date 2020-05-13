import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();
        LocalDate localDate = LocalDate.ofYearDay(year, dayOfYear);

        System.out.println(localDate.getDayOfMonth() == localDate.lengthOfMonth());
    }
}