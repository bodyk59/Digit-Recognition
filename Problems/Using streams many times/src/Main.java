import java.util.List;
import java.util.function.*;
import java.util.stream.*;

class FunctionUtils {
    public static <T> Supplier<Stream<T>> saveStream(Stream<T> stream){
        List<T> list = stream.collect(Collectors.toList());
        return list::stream;
    }
}