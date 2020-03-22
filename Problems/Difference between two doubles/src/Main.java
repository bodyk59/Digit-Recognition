import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double result = secondNumber - firstNumber;

        System.out.println(result);
    }
}