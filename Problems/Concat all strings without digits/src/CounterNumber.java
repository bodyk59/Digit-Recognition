import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bogdan Kurchak
 */
public class CounterNumber {
    public static void main(String[] args) {
        String binary = "000111010001110001011000001110";
        Pattern pattern = Pattern.compile(".110");
        Matcher matcher = pattern.matcher(binary);
        int counter = 0;

        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter);
    }
}
