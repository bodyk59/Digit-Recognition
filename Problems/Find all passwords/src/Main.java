import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String copyText = text.replaceAll("[\\s:]+", " ");

        Pattern pattern = Pattern.compile("(?is)password[\\s+:]*[a-zA-Z\\d]+");
        Matcher matcher = pattern.matcher(copyText);
        boolean flag = true;

        while (matcher.find()) {
            String password = matcher.group();
            System.out.println(password.substring(9));
            flag = false;
        }

        if (flag) {
            System.out.println("No passwords found.");
        }
    }
}
