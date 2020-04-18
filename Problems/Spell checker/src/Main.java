import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfKnownWords = scanner.nextInt();

        Set<String> setOfKnownWords = new HashSet<>();

        for (int i = 0; i < numberOfKnownWords; i++) {
            setOfKnownWords.add(scanner.next().toLowerCase());
        }

        int numberLineOfText = scanner.nextInt();
        Set<String> setOfText = new HashSet<>();

        for (int i = 0; i < numberLineOfText; i++) {
            String[] temp = scanner.nextLine().split("\\s+");
            Collections.addAll(setOfText, temp);
        }

        System.out.println(setOfText);
    }
}
