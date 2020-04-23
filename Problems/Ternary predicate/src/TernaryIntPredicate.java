@FunctionalInterface
public interface TernaryIntPredicate {
    boolean test(int x, int y, int z);
}

public static final TernaryIntPredicate allValuesAreDifferentPredicate = (x, y, z) -> x != y && y != z && x != z;