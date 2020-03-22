import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double gravity = 9.8;
        double liquidPressure = density * gravity * height;

        System.out.println(liquidPressure);
    }
}