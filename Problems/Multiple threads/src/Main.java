public class Main {

    public static void main(String[] args) {
        Thread thread1 = new WorkerThread();
        Thread thread2 = new WorkerThread();

        thread1.setName("worker-1");
        thread2.setName("worker-1");

        thread1.start();
        thread2.start();
    }
}