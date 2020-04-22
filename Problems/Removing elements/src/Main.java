// Posted from EduTools plugin
import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        String[] temp = str.split("\\s+");
        Set<Integer> set = new TreeSet<>();

        for (String s : temp) {
            set.add(Integer.parseInt(s));
        }

        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new TreeSet<>(set);
        for (int number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}