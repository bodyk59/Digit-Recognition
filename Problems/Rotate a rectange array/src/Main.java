import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] firstArray = new int[lines][columns];
        int[][] secondArray = new int[columns][lines];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            for (int j1 = 0, j2 = lines - 1; j1 < secondArray[i].length && j2 >= 0; j1++, j2--) {
                secondArray[i][j1] = firstArray[j2][i];

                System.out.printf("%d ", secondArray[i][j1]);
            }

            System.out.println();
        }
    }
}
