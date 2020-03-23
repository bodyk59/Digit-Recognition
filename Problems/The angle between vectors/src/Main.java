import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int u1 = scanner.nextInt();
        int u2 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        int numerator = u1 * v1 + u2 * v2;

        double denominator = Math.sqrt(Math.pow(u1, 2) + Math.pow(u2, 2)) *
                Math.sqrt(Math.pow(v1, 2) + Math.pow(v2, 2));

        double angle = Math.acos(numerator / denominator);

        System.out.println(Math.toDegrees(angle));
    }
}
