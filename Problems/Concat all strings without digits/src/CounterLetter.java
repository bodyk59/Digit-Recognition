import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bogdan Kurchak
 */
public class CounterLetter {
    public static void main(String[] args) {
        String text = "Humans are hardly the only interesting members of the animal kingdom. " +
                "Research on the bodies and behaviors of our furry cousins can help scientists " +
                "learn more about our own species’ evolution and cognition. " +
                "And even when they don’t help unlock the ancient secrets of human ancestry, " +
                "some animals are just too cute — or weird, or gross, " +
                "or terrifying — not to get to know a little better.";

        Pattern pattern = Pattern.compile("and?");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;

        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter);
    }
}
