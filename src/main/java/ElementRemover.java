import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ElementRemover implements Remover {

    private <T extends Number> Collection<T> excludeRepeatingElements(Collection<T> collection, Iterator<T> iterator) {
        final T nextValue = iterator.next();
        collection.removeAll(new ArrayList<T>() {{
            add(nextValue);
        }});
        collection.add(nextValue);
        return iterator.hasNext() ? excludeRepeatingElements(collection, iterator) : collection;
    }

    @Override
    public <T extends Number> Collection<T> excludeRepeatingElements(Collection<T> collection) {
        List<T> list = new ArrayList<T>() {{
            addAll(collection);
        }};
        return excludeRepeatingElements(list, collection.iterator());
    }
}
