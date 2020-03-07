import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arraysOfNumbers = new int[length];
        int sum = 0;

        for (int i = 0; i < arraysOfNumbers.length; i++) {
            arraysOfNumbers[i] = scanner.nextInt();
            sum += arraysOfNumbers[i];
        }

        System.out.println(sum);
    }
}