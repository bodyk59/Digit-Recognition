// Posted from EduTools plugin
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] line = new Scanner(System.in).nextLine().split("\\s+");

        List<String> result = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            if (i % 2 != 0) {
                result.add(line[i]);
            }
        }

        Collections.reverse(result);

        result.forEach(number -> System.out.print(number + " "));
    }
}