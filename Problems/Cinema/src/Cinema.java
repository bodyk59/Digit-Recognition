import java.util.Scanner;

class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int required = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < matrix.length; ++i) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == 0) {
                    ++count;
                    if (count == required) {
                        result = i + 1;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            if (result != 0) {
                break;
            }
        }

        System.out.println(result);
    }
}