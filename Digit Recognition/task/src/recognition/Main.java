package recognition;
import java.util.*;

/**
 * @author Bogdan Kurchak
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;

        char[][] inputValues = new char[3][3];

        int[][] neuronValues = new int[3][3];
        int [][] weights = {{2, 1, 2}, {4, -4, 4}, {2, -1, 2}};

        int bias = -5;
        int result = 0;

        result += bias;

        for (int i = 0; i < neuronValues.length; i++) {
            line = scanner.next();

            for (int j = 0; j < neuronValues.length; j++) {
                // Here, we set the read value to an array of character(colours)
                inputValues[i][j] = line.charAt(j);

                if (inputValues[i][j] == '_') {
                    // If colour white, the neuron value is 0
                    neuronValues[i][j] = 0;
                    // Finding the value of output neuron
                    result += neuronValues[i][j] * weights[i][j];
                }

                if (inputValues[i][j] == 'X') {
                    // If colour blue, the neuron value is 1
                    neuronValues[i][j] = 1;
                    result += neuronValues[i][j] * weights[i][j];
                }
            }
        }

        System.out.println("Input grid :");

        // This method print out the inputted grid
        for (char[] lineValues : inputValues) {
            for (char value : lineValues) {
                System.out.print(value);
            }
            System.out.println();
        }

        System.out.print("This is number is ");

        // Here we print out the value of output neuron
        if (result < 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}