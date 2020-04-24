startLongProcess(new Callback() {
    @Override
    public void onStarted() {
        System.out.println("The process started");
    }

    @Override
    public void onStopped(String cause) {
        System.out.println(cause);
    }

    @Override
    public void onFinished(int code) {
        System.out.println(code == 0
            ? "The process successfully finished"
            : "The process is finished with error: " + code);
    }
});