import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] continents = new String[7];

        for (int i = 0; i < continents.length; i++) {
            String temp = scanner.next();

            if (temp.equals("North") || temp.equals("South")) {
                temp += " " + scanner.next();
            }

            continents[i] = temp;
        }

        System.out.println("Asia\n" +
                "Africa\n" +
                "North America\n" +
                "South America\n" +
                "Antarctica\n" +
                "Europe\n" +
                "Australia");
    }
}
