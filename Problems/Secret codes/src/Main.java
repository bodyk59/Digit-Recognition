import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static List<String> extractCodes(List<String> codes) {
        return codes.stream()
                .dropWhile(string -> !Objects.equals(string, "#0000"))
                .takeWhile(string -> !Objects.equals(string, "#FFFF"))
                .skip(1)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> codes = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .collect(Collectors.toList());

        System.out.println(String.join(" ", extractCodes(codes)));
    }
}