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

        int [][] weights = {{2, 1, 2}, {4, -4, 4}, {2, -1, 2}};

        int bias = -5;
        int result = 0;

        result += bias;

        for (int i = 0; i < inputValues.length; i++) {
            line = scanner.next();

            for (int j = 0; j < inputValues.length; j++) {
                // Here, we set the read value to an array of character(colours)
                inputValues[i][j] = line.charAt(j);

                if (inputValues[i][j] == 'X') {
                    // If colour blue, the neuron value is 1 and if colour white, the neuron value is 0
                    result +=  weights[i][j];
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

        // Here we print out the value of output neuron
        System.out.printf("This is number is %d", result < 0 ? 1 : 0);
    }
}