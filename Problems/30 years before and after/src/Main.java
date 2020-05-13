import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LocalDate controlDate = LocalDate.parse(new Scanner(System.in).nextLine());
        System.out.println(controlDate.minusYears(30));
        System.out.println(controlDate.plusYears(30));
    }
}