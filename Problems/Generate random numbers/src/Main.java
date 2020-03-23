import java.util.*;

/**
 * @author Bogdan Kurchak
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Random random = new Random(a + b);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(b - a + 1) + a;
            sum += randomNumber;
        }

        System.out.printf("%d", sum);
    }
}
