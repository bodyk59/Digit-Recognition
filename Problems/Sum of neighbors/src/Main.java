import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        StringBuilder stringBuilder = new StringBuilder();
//        String temp = scanner.next();
//
//        while (!"end".equals(temp)) {
//            stringBuilder.append(temp).append(" ");
//            temp = scanner.next();
//        }
//
//        System.out.println(stringBuilder);

        int[][] inputMatrix = new int[3][3];
        int[][] clone = new int[3][3];

        String temp = scanner.next();

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j ++) {
                inputMatrix[i][j] = Integer.parseInt(temp);
                clone[i][j] = Integer.parseInt(temp);
                temp = scanner.next();
            }
        }

        for (int i = 0; i < clone.length; i++) {
            for (int j = 0; j < clone[i].length; j ++) {
                int firstElement = i - 1 < 0 ? clone[2][j] : clone[i - 1][j];
                int secondElement = i + 1 > 2 ? clone[0][j] : clone[i + 1][j];
                int thirdElement = j - 1 < 0 ? clone[i][2] : clone[i][j - 1];
                int fourthElement = j + 1 > 2 ? clone[i][0] : clone[i][j + 1];

                inputMatrix[i][j] = firstElement + secondElement + thirdElement + fourthElement;

                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//inputMatrix[i].length - 1 / 2
//inputMatrix[i].length - 2 / 0
//inputMatrix[i].length - 1 /
//inputMatrix[i].length - 2 / 2