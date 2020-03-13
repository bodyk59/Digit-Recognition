import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Fibonacci of " + n +
                "th term" + " " +"is" +" " + fib(n));
    }

    // Returns n-th Fibonacci number
    static BigInteger fib(int n) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;

        for (int i = 2 ; i <= n ; i++) {
            c =  a.add(b);
            a = b;
            b = c;
        }

        return (a);
    }
}
