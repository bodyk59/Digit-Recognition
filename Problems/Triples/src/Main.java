import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arraysOfNumbers = new int[length];
        int count = 0;

        for (int i = 0; i < arraysOfNumbers.length; i++) {
            arraysOfNumbers[i] = scanner.nextInt();

            if (i > 0 && arraysOfNumbers[i] - arraysOfNumbers[i - 1] == 1) {
                count++;
            } else {
                count -= 1;
            }
        }

        System.out.println(Math.max(count, 0));
    }
}
