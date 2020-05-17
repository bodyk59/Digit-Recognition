public static long factorial(long n) {
    return LongStream.rangeClosed(1L, n)
        .reduce(1, (acc, i) -> acc * i);
}