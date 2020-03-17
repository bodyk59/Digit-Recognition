import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][(j + i) % matrix[i].length] = j;
            }
        }

        for (int[] array : matrix) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}