import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDinArraySize = scanner.nextInt();
        int secondDinArraySize = scanner.nextInt();

        int[][] arrayOfNumbers = new int[firstDinArraySize][secondDinArraySize];

        for (int i = 0; i < firstDinArraySize; i++) {
            for (int j = 0; j < secondDinArraySize; j++) {
                arrayOfNumbers[i][j] = scanner.nextInt();
            }
        }

        int firstColumnIndex = scanner.nextInt();
        int secondColumnIndex = scanner.nextInt();
        int temp = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            temp = arrayOfNumbers[i][firstColumnIndex];
            arrayOfNumbers[i][firstColumnIndex] = arrayOfNumbers[i][secondColumnIndex];
            arrayOfNumbers[i][secondColumnIndex] = temp;
        }

        for (int i = 0; i < firstDinArraySize; i++) {
            for (int j = 0; j < secondDinArraySize; j++) {
                System.out.print(arrayOfNumbers[i][j] + " ");
            }

            System.out.println();
        }
    }
}
