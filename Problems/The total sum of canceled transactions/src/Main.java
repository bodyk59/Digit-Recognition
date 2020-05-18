public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
    return accounts.stream()
        .filter(account -> account.getBalance() > 0)
        .flatMap(account -> account.getTransactions().stream())
        .filter(state -> state.getState() == State.CANCELED)
        .mapToLong(Transaction::getSum)
        .sum();
}