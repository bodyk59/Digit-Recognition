import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int finish = scanner.nextInt();
        int firstDivisor = scanner.nextInt();
        int secondDivisor = scanner.nextInt();
        System.out.println(
//                IntStream.rangeClosed(start, finish)
//                        .filter(x -> x % firstDivisor == 0 || x % secondDivisor == 0)
//                        .sum()
                IntStream.rangeClosed(start, finish)
                        .reduce(0, (acc, x) -> {
                            if (x % firstDivisor == 0 || x % secondDivisor == 0)
                                acc += x;
                            return acc;
                        })
        );
    }
}
