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
        double c = scanner.nextDouble();

        double D = Math.pow(b, 2) - (4 * a * c);

        double x1 = 0.0;
        double x2 = 0.0;

        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
        }

        if (D == 0) {
            x1 = x2 = -b / (2 * a);
        }

        System.out.println(D >= 0 ? Math.min(x1, x2) + " " + Math.max(x1, x2) : 0);
    }
}
