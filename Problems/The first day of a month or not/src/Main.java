import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println(LocalDate.ofYearDay(scanner.nextInt(), scanner.nextInt()).getDayOfMonth() == 1);
    }
}