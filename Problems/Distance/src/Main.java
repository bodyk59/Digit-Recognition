import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int duration = scanner.nextInt();
        double speed = distance / duration;

        System.out.println(speed);
    }
}