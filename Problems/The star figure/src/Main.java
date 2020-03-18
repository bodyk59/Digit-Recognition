import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String[][] table = new String[size][size];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (j == size / 2)
                        || (i == size / 2)
                        || (i == j)
                        || (j == (table[i].length - 1) - i) ? "*" : ".";

                System.out.printf("%s ", table[i][j]);
            }

            System.out.println();
        }
    }
}
