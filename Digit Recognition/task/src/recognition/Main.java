package recognition;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        char[][] inputValues = new char[3][3];
        int[][] neuronValues = new int[3][3];
        int [][] weights = {{2, 1, 2}, {4, -4, 4}, {2, -1, 2}};
        int bias = -5;
        int result = 0;

        for (int i = 0; i < neuronValues.length; i++) {
            line = scanner.next();

            for (int j = 0; j < neuronValues.length; j++) {
                inputValues[i][j] = line.charAt(j);

                switch (inputValues[i][j]) {
                    case '_':
                        neuronValues[i][j] = 0;
                        result += neuronValues[i][j] * weights[i][j];
                        break;

                    case 'X':
                        neuronValues[i][j] = 1;
                        result += neuronValues[i][j] * weights[i][j];
                        break;
                }
            }
        }

        System.out.println("Input grid :");
        for (char[] inLineValues : inputValues) {
            for (char value : inLineValues) {
                System.out.print(value);
            }
            System.out.println();
        }

        System.out.print("This is number is ");
        if (result + bias < 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}