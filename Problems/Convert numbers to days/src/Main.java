import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            System.out.println(LocalDate.ofYearDay(year, scanner.nextInt()));
        }
    }
}
