import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int character;
            String line = "";

            while ((character = reader.read()) != -1) {
                line += (char) character;
            }

            String[] words = line.trim().split("\\s+");

            System.out.println(line.isBlank() ? 0 : words.length);
        }
    }
}
