import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

class BadWordsDetector {

    private static Stream<String> createBadWordsDetectingStream(String text, 
                                                                List<String> badWords) {
        return badWords.stream()
                .filter(text::contains)
                .distinct()
                .sorted();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(";");

        String text = parts[0];

        List<String> dict = parts.length > 1 ?
                Arrays.asList(parts[1].split(" ")) :
                Collections.singletonList("");

        System.out.println(createBadWordsDetectingStream(text, dict).collect(Collectors.toList()));
    }

}