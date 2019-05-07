import java.util.Collection;
import java.util.stream.Collectors;

class StreamAPI {
    <T extends Number> Collection<T> excludeRepeatingElements(Collection<T> collection) {
        return collection
                .stream()
                .distinct()
                .collect
                        (Collectors.
                                toList());


    }
}
