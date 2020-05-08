public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableWorker());
        Thread thread2 = new Thread(new RunnableWorker());
        Thread thread3 = new Thread(new RunnableWorker());

        thread1.setName("worker-1");
        thread2.setName("worker-2");
        thread3.setName("worker-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}