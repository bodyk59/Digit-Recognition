class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        while (true) {
            counter++;
            if (isInterrupted()) {
                System.out.println("It was interrupted");
                return;
            }
        }
    }
}