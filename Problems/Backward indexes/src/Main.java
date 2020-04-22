// Posted from EduTools plugin
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static <T> T getElementByIndex(List<T> lst, int index) {
        if (index < -(lst.size() - 1) && index > lst.size() - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            if (index >= 0) {
                return lst.get(index);
            } else {
                Collections.reverse(lst);
                return lst.get(Math.abs(index) - 1);
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<String> values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        final int index = Integer.parseInt(scanner.nextLine());

        try {
            String element = getElementByIndex(values, index);
            System.out.println(element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }
}