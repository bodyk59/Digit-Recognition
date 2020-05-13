import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LocalTime> firstRange = new ArrayList<>(List.of(
                LocalTime.parse(scanner.next()),
                LocalTime.parse(scanner.next())));
        List<LocalTime> secondRange = new ArrayList<>(List.of(
                LocalTime.parse(scanner.next()),
                LocalTime.parse(scanner.next())));

        System.out.println(firstRange.get(1).isAfter(secondRange.get(0))
                && secondRange.get(1).isAfter(firstRange.get(0))
                || firstRange.get(0).equals(secondRange.get(1))
                || firstRange.get(1).equals(secondRange.get(0)));
    }
}
