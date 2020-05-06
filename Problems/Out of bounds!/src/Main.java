import java.util.*;

class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();

        System.out.println(index >= 0 && index < string.length()
                ? string.charAt(index)
                : "Out of bounds!");
    }
}