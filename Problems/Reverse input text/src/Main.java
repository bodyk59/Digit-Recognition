import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = ((BufferedReader) reader).readLine();

            System.out.println(new StringBuilder(line).reverse());
        }
    }
}