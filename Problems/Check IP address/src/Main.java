import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in)
                .nextLine()
                .matches("\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])(\\.|$)){4}\\b") ? "YES" : "NO");
    }
}