import java.util.*;

/**
 * @author Bogdan Kurchak
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] results = new int[b - a + 1];
        int[] clone = new int[b - a + 1];

        int temp = Integer.MIN_VALUE;

        for (int i = a, j = 0; i <= b; i++, j++) {
            Random random = new Random(i);

            for (int l = 0; l < n; l++) {
                int maxNumber = random.nextInt(k);

                if (maxNumber > temp) {
                    temp = maxNumber;
                }
            }

            results[j] = temp;
            clone[j] = temp;
            temp = 0;
        }

        Arrays.sort(clone);

        int neededNumber = clone[0];
        int position = 0;

        for (int i = 0; i < results.length; i++) {
            if (neededNumber == results[i]) {
                position = i + a;
                break;
            }
        }

        System.out.printf("%d\n%d", position, neededNumber);
    }
}
