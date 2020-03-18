import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        int k = 0;
        int l = 0;
        int lastColumn = n - 1;
        int lastRow = n - 1;

        int number = 1;

        while (k <= lastRow && l <= lastColumn) {
            for (int i = l; i <= lastColumn; i++) {
                matrix[l][i] = number++;
            }

            k++;

            for (int i = k; i <= lastRow; i++) {
                matrix[i][lastColumn] = number++;
            }

            lastColumn--;

            if (k <= lastRow) {
                for (int i = lastColumn; i >= l; i--) {
                    matrix[lastRow][i] = number++;
                }

                lastRow--;
            }

            if (l <= lastColumn) {
                for (int i = lastRow; i >= k; i--) {
                    matrix[i][l] = number++;
                }

                l++;
            }
        }

        for (int[] array : matrix) {
            for (int i : array) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
