import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        LocalDate firstDate = LocalDate.parse(scanner.nextLine());
        int year = firstDate.getYear();

        int times = Integer.parseInt(scanner.nextLine());
        Period periodOfDay = Period.ofDays(times);

        while (firstDate.getYear() == year) {
            System.out.println(firstDate);
            firstDate = firstDate.plus(periodOfDay);
        }
    }
}