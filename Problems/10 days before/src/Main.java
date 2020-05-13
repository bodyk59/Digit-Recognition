import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.parse(new Scanner(System.in).nextLine()).minusDays(10));
    }
}