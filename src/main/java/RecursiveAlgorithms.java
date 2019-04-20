import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class RecursiveAlgorithms<T> {

    private static <T> T find(final Collection<T> collection,  final int index, int startPos, Iterator<T> iterator){
        iterator.next();
        return index == startPos ? iterator.next() : find(collection, index, ++startPos, iterator);
    }

    public static<T> T find (final Collection<T> collection, int index){
        return index >= collection.size() ? null : find(collection, --index, 0, collection.iterator());
    }

    private static<T> Collection<T> excludeRepeatingElements(Collection<T> collection, Iterator<T> iterator){
        final T nextValue = iterator.next();
        collection.removeAll(new ArrayList<T>(){{
            add(nextValue);
        }});
        collection.add(nextValue);
        return iterator.hasNext()? excludeRepeatingElements(collection,iterator) : collection;
    }

    public static<T> Collection<T> excludeRepeatingElements(Collection<T> collection){
        List<T> list = new ArrayList<>();
        list.addAll(collection);
        return excludeRepeatingElements(list, collection.iterator() );
    }

}
