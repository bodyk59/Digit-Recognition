import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            list.add(new Integer[columns]);

            for (int j = 0; j < columns; j++) {
                list.get(i)[j] = scanner.nextInt();
            }
        }

        int rotate = scanner.nextInt();

        Collections.rotate(list, rotate);

        list.forEach(array -> {
            for (int number : array) {
                System.out.print(number + " ");
            }

            System.out.println();
        });
    }
}
