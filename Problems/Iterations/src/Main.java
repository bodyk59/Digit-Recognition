static void performIterationsWithCallback(int numberOfIterations, LoopCallback callback) {
    for (int i = 0; i < numberOfIterations; i++) {
        callback.onNewIteration(i);
    }
}

static void startIterations(int numberOfIterations) {
    performIterationsWithCallback(numberOfIterations, new LoopCallback() {
        @Override
        public void onNewIteration(int i) {
            System.out.println("Iteration: " + i);
        }
    });
}