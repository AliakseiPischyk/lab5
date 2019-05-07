import java.util.Collection;
import java.util.stream.Collectors;

public class StreamAPI {
    public <T extends Number> Collection<T> excludeRepeatingElements(Collection<T> collection) {
        return collection
                .stream()
                .distinct()
                .collect
                        (Collectors.
                                toList());


    }
}
