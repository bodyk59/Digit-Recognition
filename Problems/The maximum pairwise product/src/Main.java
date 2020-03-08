import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arraysOfNumbers = new int[length];

        for (int i = 0; i < arraysOfNumbers.length; i++) {
            arraysOfNumbers[i] = scanner.nextInt();
        }

        Arrays.sort(arraysOfNumbers);

        System.out.println(arraysOfNumbers.length == 1 ? arraysOfNumbers[0]
                : arraysOfNumbers[arraysOfNumbers.length - 1] * arraysOfNumbers[arraysOfNumbers.length - 2]);
    }
}
