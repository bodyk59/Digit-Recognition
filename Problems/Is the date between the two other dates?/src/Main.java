import java.time.LocalDate;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate neededDate = LocalDate.parse(scanner.next());

        List<LocalDate> localDates = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            localDates.add(LocalDate.parse(scanner.next()));
        }
        Collections.sort(localDates);

        System.out.println(neededDate.isAfter(localDates.get(0))
                && neededDate.isBefore(localDates.get(1)));
    }
}