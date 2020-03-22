package recognition;
import java.util.*;

/**
 * @author Bogdan Kurchak
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        char[][] inputValues = new char[5][3];
        int[][] neuronValues = new int[5][3];
        int[] resultArray = new int[10];
        int result = 0;
        int[] bias = {-1, 6, 1, 0, 2, 0, -1, 3, -2, -1};
        int[][][] weights = { {{1, 1, 1}, {1, -1, 1}, {1, -1, 1}, {1, -1, 1}, {1, 1, 1}},//0
                {{-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1}},       //1
                {{1, 1, 1}, {-1, -1, 1}, {1, 1, 1}, {1, -1, -1}, {1, 1, 1}},             //2
                {{1, 1, 1}, {-1, -1, 1}, {1, 1, 1}, {-1, -1, 1}, {1, 1, 1}},             //3
                {{1, -1, 1}, {1, -1, 1}, {1, 1, 1}, {-1, -1, 1}, {-1, -1, 1}},           //4
                {{1, 1, 1}, {1, -1, -1}, {1, 1, 1}, {-1, -1, 1}, {1, 1, 1}},             //5
                {{1, 1, 1}, {1, -1, -1}, {1, 1, 1}, {1, -1, 1}, {1, 1, 1}},              //6
                {{1, 1, 1}, {-1, -1, 1}, {-1, -1, 1}, {-1, -1, 1}, {-1, -1, 1}},         //7
                {{1, 1, 1}, {1, -1, 1}, {1, 1, 1}, {1, -1, 1}, {1, 1, 1}},               //8
                {{1, 1, 1}, {1, -1, 1}, {1, 1, 1}, {-1, -1, 1}, {1, 1, 1}},              //9
        };

        for (int i = 0; i < neuronValues.length; i++) {
            line = scanner.next();

            for (int j = 0; j < neuronValues[i].length; j++) {
                inputValues[i][j] = line.charAt(j);

                switch (inputValues[i][j]) {
                    case '_':
                        neuronValues[i][j] = 0;
                        break;

                    case 'X':
                        neuronValues[i][j] = 1;
                        break;
                }
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            for (int k = 0; k < weights[i].length; k++) {
                for (int m = 0; m < weights[i][k].length; m++) {
                    resultArray[i] += neuronValues[k][m] * weights[i][k][m];
                }
            }

            resultArray[i] += bias[i];
        }

        int maxResult = resultArray[0];

        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] > maxResult) {
                maxResult = resultArray[i];
                result = i;
            }
        }

        System.out.println("Input grid:");

        for (char[] inLineValues : inputValues) {
            for (char value : inLineValues) {
                System.out.print(value);
            }

            System.out.println();
        }

        System.out.printf("This is number is %d", result);
    }
}
