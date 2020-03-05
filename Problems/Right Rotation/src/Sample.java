import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ar = sc.nextLine().split(" ");
        int shift = sc.nextInt();
        String[] res = new String[ar.length];

        for (int i = 0; i < ar.length; i++) {
            res[(i + shift) % ar.length] = ar[i];
        }

        for (int i = 0; i < res.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(res[i]);
        }
    }
}