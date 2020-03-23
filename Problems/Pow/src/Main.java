import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double result = Math.pow(a, b);

        System.out.println(result);
    }
}
