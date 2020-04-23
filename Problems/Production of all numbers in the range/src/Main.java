(x, y) -> {
    long product = 1L;
    for (long i = x; i <= y; i++) {
        product *= i;
    }
    return product;
};