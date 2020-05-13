import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        LocalDate firstDate = LocalDate.of(year, month, 1);
        int lastDay = firstDate.lengthOfMonth();
        LocalDate lastDate = LocalDate.of(year, month, lastDay);
        System.out.println(firstDate + " " + lastDate);
    }
}