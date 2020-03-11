import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] continentsSorted = {"Asia",
                "Africa",
                "North America",
                "South America",
                "Antarctica",
                "Europe",
                "Australia"};

        String[] continents = new String[7];

        for (int i = 0; i < continents.length; i++) {
            String temp = scanner.next();

            if ("North".equals(temp) || "South".equals(temp)) {
                temp += " " + scanner.next();
            }

            continents[i] = temp;
        }

        int count = 0;

        while (count < 7) {
            for (String continent : continents) {
                if (continentsSorted[count].equals(continent)) {
                    System.out.println(continent);
                    count++;
                    break;
                }
            }
        }
    }
}
