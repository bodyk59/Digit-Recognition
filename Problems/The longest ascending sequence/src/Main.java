import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numberSequence = new int[length];

        int count = 0;
        int temp = numberSequence[0];

        for (int j = 0; j < numberSequence.length; j++) {
            numberSequence[j] = scanner.nextInt();

            if (numberSequence[j] > temp) {
                temp = numberSequence[j];
                count++;
            }
        }

        System.out.println(count);
    }
}
