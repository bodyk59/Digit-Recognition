import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        int max = array[0];
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] > max) {
                max = array[i];
                result = i;
            }
        }

        System.out.println(result);
    }
}