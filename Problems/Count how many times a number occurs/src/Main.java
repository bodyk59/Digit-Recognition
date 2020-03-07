import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arraysOfNumbers = new int[length];

        for (int i = 0; i < arraysOfNumbers.length; i++) {
            arraysOfNumbers[i] = scanner.nextInt();
        }

        int searchedNumber = scanner.nextInt();
        int count = 0;

        for (int number : arraysOfNumbers) {
            if (number == searchedNumber) {
                count++;
            }
        }

        System.out.println(count);
    }
}