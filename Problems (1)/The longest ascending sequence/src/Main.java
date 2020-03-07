
import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numberSequence = new int[length];

        for (int j = 0; j < numberSequence.length; j++) {
            numberSequence[j] = scanner.nextInt();
        }

        int count = 1;
        int temp = 0;

        for (int i = 1; i < numberSequence.length; i++) {
            if (numberSequence[i] > numberSequence[i - 1]) {
                temp = ++count;
            } else {
                count = 1;
            }
        }

        System.out.println(numberSequence.length > 1 ? temp : 1);
    }
}