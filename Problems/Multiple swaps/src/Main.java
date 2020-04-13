import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        List<String> immutableList = List.of(scanner.nextLine().split("\\s+"));
        List<String> mutableList = new ArrayList<>(immutableList);

        int numberOfSwaps = scanner.nextInt();

        for (int i = 0; i < numberOfSwaps; i++) {
            Collections.swap(mutableList, scanner.nextInt(), scanner.nextInt());
        }

        mutableList.forEach(number -> System.out.print(number + " "));
    }
}
