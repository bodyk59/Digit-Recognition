import java.util.*;

/**
 * @author Bogdan Kurchak
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            String[] room = scanner.nextLine().split("\\s+");
            for (String person : room) {
                guests.add(person);
            }
        }

        Collections.reverse(guests);
        guests.forEach(person -> System.out.println(person));
    }
}
