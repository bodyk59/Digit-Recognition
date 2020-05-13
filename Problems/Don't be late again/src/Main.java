import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfStores = Integer.parseInt(scanner.nextLine());
        LocalTime exitTime = LocalTime.of(19, 30);
        int timeInRoad = 30;

        Map<String, LocalTime> mapOfStores = new LinkedHashMap<>();

        for (int i = 0; i < amountOfStores; i++) {
            mapOfStores.put(scanner.next(), LocalTime.parse(scanner.next()));
        }

        for (Map.Entry<String, LocalTime> entry : mapOfStores.entrySet()) {
            if (exitTime.plusMinutes(timeInRoad).isBefore(entry.getValue())) {
                System.out.println(entry.getKey());
            }
        }
    }
}