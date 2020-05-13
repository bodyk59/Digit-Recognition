import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime max = LocalDateTime.MIN;
        int counter = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < counter; i++) {
            LocalDateTime temp = LocalDateTime.parse(scanner.nextLine());
            if (temp.isAfter(max)) {
                max = temp;
            }
        }

        System.out.println(max);
    }
}