import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arraysOfNumbers = new int[length];

        for (int i = 0; i < arraysOfNumbers.length; i++) {
            arraysOfNumbers[i] = scanner.nextInt();
        }

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        boolean flag = false;

        for (int i = 1; i < arraysOfNumbers.length; i++) {
            if (arraysOfNumbers[i - 1] == firstNumber && arraysOfNumbers[i] == secondNumber
            || arraysOfNumbers[i - 1] == secondNumber && arraysOfNumbers[i] == firstNumber) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);
    }
}