import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arraysOfNumbers = new int[length];
        boolean flag = true;

        for (int i = 0; i < arraysOfNumbers.length; i++) {
            arraysOfNumbers[i] = scanner.nextInt();

            if (i > 0 && arraysOfNumbers[i - 1] > arraysOfNumbers[i]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}