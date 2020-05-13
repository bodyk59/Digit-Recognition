import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<LocalDateTime> dateTimeList = new ArrayList<>(List.of(
                        LocalDateTime.parse(scanner.nextLine()),
                        LocalDateTime.parse(scanner.nextLine())));

        Collections.sort(dateTimeList);

        int pairs = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i < pairs; i++) {
            LocalDateTime temp = LocalDateTime.parse(scanner.nextLine());
            if (temp.isAfter(dateTimeList.get(0))
                    && temp.isBefore(dateTimeList.get(1))
                    || temp.isEqual(dateTimeList.get(0))) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
