import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in)
                .nextLine()
                .matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{12,}$") ? "YES" : "NO");
    }
}