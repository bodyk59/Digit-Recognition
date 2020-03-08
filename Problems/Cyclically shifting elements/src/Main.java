import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arraysOfNumbers = new int[length];

        for (int i = 1; i < arraysOfNumbers.length; i++) {
            arraysOfNumbers[i] = scanner.nextInt();
        }
        arraysOfNumbers[0] = scanner.nextInt();

        for (int number : arraysOfNumbers) {
            System.out.print(number + " ");
        }
    }
}