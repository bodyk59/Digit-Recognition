import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bogdan Kurchak
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Matcher matcher = Pattern.compile("(?i:(?<=password)[\\s:]*[0-9a-z]+)").matcher(text);

        if (matcher.find()) {
            do {
                System.out.println(matcher.group().replaceAll("[\\s:]*", ""));
            } while (matcher.find());
        } else {
            System.out.println("No passwords found.");
        }
    }
}
