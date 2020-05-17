public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
    return predicates.stream().reduce(x -> false, IntPredicate::or);
}