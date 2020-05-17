import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        long countOfUniqueWords = Stream.generate(() -> Arrays.stream(scanner.nextLine().split("\\s+")))
                .limit(numberOfLines)
                .flatMap(Function.identity())
                .map(String::toLowerCase)
                .distinct()
                .count();

        System.out.println(countOfUniqueWords);
    }
}