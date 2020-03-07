import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arrayOfNumbers = new int[length];

        int min = arrayOfNumbers[0] = scanner.nextInt();

        for (int i = 1; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.nextInt();

            if (arrayOfNumbers[i] < min) {
                min = arrayOfNumbers[i];
            }
        }

        System.out.println(min);
    }
}
