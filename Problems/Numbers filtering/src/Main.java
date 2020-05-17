public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
    return IntStream.concat(evenStream, oddStream)
        .filter(number -> number % 3 == 0)
        .filter(number -> number % 5 == 0)
        .sorted()
        .skip(2);
}