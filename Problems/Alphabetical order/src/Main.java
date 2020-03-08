import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arraysOfStrings = scanner.nextLine().split(" ");
        String[] arraysCopy = arraysOfStrings.clone();

        Arrays.sort(arraysOfStrings);

        boolean flag = true;

        for (int i = 0; i < arraysOfStrings.length; i++) {
             if (!arraysOfStrings[i].equals(arraysCopy[i])) {
                 flag = false;
                 break;
             }
        }

        System.out.println(flag);
    }
}
