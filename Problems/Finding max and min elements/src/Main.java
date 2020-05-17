public static <T> void findMinMax(
        Stream<? extends T> stream,
        Comparator<? super T> order,
        BiConsumer<? super T, ? super T> minMaxConsumer) {
    List<? extends T> list = stream.collect(Collectors.toList());
    minMaxConsumer.accept(list.stream().min(order).orElse(null),
        list.stream().max(order).orElse(null));
}
