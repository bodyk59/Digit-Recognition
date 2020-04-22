// Posted from EduTools plugin
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iteration = scanner.nextInt();

        Set<String> stringSet = new TreeSet<>();
        for (int i = 0; i < iteration; i++) {
            stringSet.add(scanner.next());
        }

        stringSet.forEach(string -> System.out.println(string));
    }
}
