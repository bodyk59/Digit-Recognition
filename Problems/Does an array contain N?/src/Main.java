import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arrayOfNumbers = new int[length];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }

        int searchedNumber = scanner.nextInt();

        boolean present = false;

        for (int number : arrayOfNumbers) {
            if (number == searchedNumber) {
                present = true;
            }
        }

        System.out.println(present);
    }
}
