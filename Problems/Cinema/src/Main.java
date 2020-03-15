import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        int[][] cinemaHall = new int[rows][seats];

        for (int i = 0; i < cinemaHall.length; i++) {
            for (int j = 0; j < cinemaHall[i].length; j++) {
                cinemaHall[i][j] = scanner.nextInt();
            }
        }

        int neighbourSeats = scanner.nextInt();
        int count = 1;
        int temp = 1;
        int result = 0;

        for (int i = 0; i < cinemaHall.length; i++) {
            int j = 0;
            for ( ; j < cinemaHall[i].length; j++) {
                if (cinemaHall[i][j] == 0 && temp == cinemaHall[i][j]) {
                    count++;
                }
                temp = cinemaHall[i][j];
            }
            if (count >= neighbourSeats) {
                result = i + 1;
                break;
            }
            count = 1;
        }

        System.out.println(Math.max(0, result));
    }
}