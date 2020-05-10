import java.util.concurrent.*;

class SecondVariant {

    public static int determineCallableDepth(Callable callable) {
        Object result = callable;
        int count = 0;

        try {
            while (result instanceof Callable) {
                result = ((Callable) result).call();
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

}
