import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> dictionary = new LinkedHashSet<>();

        int dictionarySize = scanner.nextInt();

        for (int i = 0; i < dictionarySize; i++) {
            dictionary.add(scanner.next().toLowerCase());
        }

        int lineOfText = scanner.nextInt();
        scanner.nextLine();
        Set<String> text = new LinkedHashSet<>();

        for (int i = 0; i < lineOfText; i++) {
            String[] line = scanner.nextLine().toLowerCase().split("\\s+");
            text.addAll(Arrays.asList(line));
        }

        dictionary.removeAll(text);
        dictionary.forEach(word -> System.out.println(word));
    }
}
