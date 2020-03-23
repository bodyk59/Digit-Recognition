import java.util.*;

/**
 * @author Bogdan Kurchak
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double k = scanner.nextDouble();
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        long seed = 0L;
        boolean flag = true;

        while (flag) {
            Random random = new Random(seed);
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (random.nextGaussian() <= m) {
                    count++;
                }
            }

            flag = !(seed >= k && n == count);
            seed++;
        }

        System.out.println(seed - 1);
    }
}
