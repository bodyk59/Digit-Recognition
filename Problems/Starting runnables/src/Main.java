public static void startRunnables(Runnable[] runnables) {
    for (Runnable runnable : runnables) {
        new Thread(runnable).start();
    }
}