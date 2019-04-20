import java.util.Collection;
import java.util.stream.Collectors;

public abstract class StreamAPI {
    public static<T> Collection<T> excludeRepeatingElements(Collection<T> collection) {
        return collection
                .stream()
                .distinct()
                .collect
                        (Collectors.
                                toList());


    }
}
