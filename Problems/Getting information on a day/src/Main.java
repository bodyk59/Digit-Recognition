import java.time.LocalDate;
import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        System.out.println(localDate.getDayOfYear() + " " + localDate.getDayOfMonth());
    }
}