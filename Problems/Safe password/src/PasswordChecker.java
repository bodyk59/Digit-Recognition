import java.util.*;

/**
 * @author Bogdan Kurchak
 */
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();

        if (password.length() >= 12
                && password.matches(".*[0-9]+.*")
                && password.matches(".*[A-Z]+.*")
                && password.matches(".*[a-z]+.*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
