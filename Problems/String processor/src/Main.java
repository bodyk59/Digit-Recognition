class StringProcessor extends Thread {
    final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            String word = scanner.nextLine();
            if (java.util.Objects.equals(word, word.toUpperCase())) {
                System.out.println("FINISHED");
                break;
            } else {
                System.out.println(word.toUpperCase());
            }
        }
    }
}