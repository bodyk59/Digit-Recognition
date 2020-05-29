import java.util.function.*;

class FunctionUtils {
    int n;
    public static Supplier<Integer> getInfiniteRange() {
        FunctionUtils functionUtils = new FunctionUtils();
        return () -> functionUtils.n++;
    }

}