import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int shift = scanner.nextInt();

        int[] intArray = new int[line.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(line[i]);
        }

        if (shift > line.length) {
            shift = shift - (shift / intArray.length) * intArray.length;
        }

        int temp1 = intArray[0];
        int temp2 = 0;

        for (int i = 0; i < shift; i++) {
            for (int j = 1; j < intArray.length; j++) {
                temp2 = intArray[j];
                intArray[j] = temp1;
                temp1 = temp2;

            }

            intArray[0] = temp2;
        }

        for (int number : intArray) {
            System.out.print(number + " ");
        }
    }
}