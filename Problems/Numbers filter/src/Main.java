class NumbersFilter extends Thread {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}