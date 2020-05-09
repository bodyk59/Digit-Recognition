class Account {

    private volatile long balance = 0;

    public synchronized boolean withdraw(long amount) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public synchronized void deposit(long amount) {
        balance += amount;
    }

    public long getBalance() {
        return balance;
    }
}