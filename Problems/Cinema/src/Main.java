import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        String[] cinemaHall = new String[rows];

        for (int i = 0; i < cinemaHall.length; i++) {
            cinemaHall[i] = scanner.next();

            for (int j = 0; j < seats - 1; j++) {
                cinemaHall[i] += scanner.next();
            }
        }

        int neighbourSeats = scanner.nextInt();
        String neededSeats = "";

        for (int i = 0; i < neighbourSeats; i++) {
            neededSeats += "0";
        }

        int result = 0;

        for (int i = 0; i < cinemaHall.length; i++) {
            if (cinemaHall[i].contains(neededSeats)) {
                result = i + 1;
                break;
            }
        }

        System.out.println(Math.max(0, result));
    }
}
