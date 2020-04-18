import java.util.*;

public class Main {

    static void changeList(List<String> list){
        String theLongest = Collections.max(list, Comparator.comparing(String::length));
        Collections.fill(list, theLongest);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}