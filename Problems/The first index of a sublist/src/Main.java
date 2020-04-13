import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        List<String> firstList = List.of(scanner.nextLine().split("\\s+"));
        List<String> secondList = List.of(scanner.nextLine().split("\\s+"));

        int start = Collections.indexOfSubList(firstList, secondList);
        int finish = Collections.lastIndexOfSubList(firstList, secondList);

        System.out.printf("%d %d", start, finish);
    }
}
