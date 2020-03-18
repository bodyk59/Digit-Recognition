import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] table = new int[lines][columns];

        int positionX = 0;
        int positionY = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = scanner.nextInt();

                if (table[i][j] > table[positionX][positionY]) {
                    positionX = i;
                    positionY = j;
                }
            }
        }

        System.out.printf("%d %d", positionX, positionY);
    }
}
