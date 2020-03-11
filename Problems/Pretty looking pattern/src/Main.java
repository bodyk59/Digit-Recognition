import java.util.*;

/**
 * @author Bogdan Kurchak
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] designMatrix = new char[4][4];
        String temp = null;

        for (int i = 0; i < 4; i++) {
            temp = scanner.nextLine();

            for (int j = 0; j < 4; j++) {
                designMatrix[i][j] = temp.charAt(j);
            }
        }

        System.out.println(Main.prettyDesign(designMatrix, designMatrix.length));
    }

    public static String prettyDesign(char[][] designMatrix, int length) {
        boolean flag = true;

        for (int i = 1; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (designMatrix[i - 1][j - 1] == designMatrix[i - 1][j]
                        && designMatrix[i - 1][j - 1] == designMatrix[i][j - 1]
                        && designMatrix[i - 1][j - 1] == designMatrix[i][j]) {
                    flag = false;
                    break;
                }
            }
        }

        return flag ? "YES" : "NO";
    }
}
