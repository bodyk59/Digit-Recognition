import java.time.LocalDateTime;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine()).plusHours(11);
        System.out.println(localDateTime.toLocalDate());
    }
}