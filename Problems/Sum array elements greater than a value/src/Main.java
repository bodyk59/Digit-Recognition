import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arraysOfNumbers = new int[length];

        for (int i = 0; i < arraysOfNumbers.length; i++) {
            arraysOfNumbers[i] = scanner.nextInt();
        }

        int biggerThan = scanner.nextInt();
        int sum = 0;

        for (int number : arraysOfNumbers) {
            if (number > biggerThan) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}