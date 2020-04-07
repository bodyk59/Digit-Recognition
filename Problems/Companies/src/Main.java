import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");

        List<String> list = new ArrayList<>(Arrays.asList(line));

        System.out.println(list);
    }
}
