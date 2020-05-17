import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .map(Math::abs)
                .sorted()
                .forEach(number -> System.out.print(number + " "));
    }
}