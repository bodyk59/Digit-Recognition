import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        List<String> list = List.of(scanner.nextLine().split("\\s+"));

        String element = scanner.next();

        System.out.println(Collections.frequency(list, element));
    }
}
