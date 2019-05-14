import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;




public class ElementRecursiveRemover implements Remover{

    @Override
    public <T extends Number> Collection<T> excludeRepeatingElements(Collection<T> collection) {
        return collection
                .stream()
                .distinct()
                .collect
                        (Collectors.
                                toList());


    }
}
