import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class RecursiveAlgorithm {

    private <T extends Number> T find(final Collection<T> collection,  final int index, int startPos, Iterator<T> iterator){
        iterator.next();
        return index == startPos ? iterator.next() : find(collection, index, ++startPos, iterator);
    }

    private  <T extends Number> T find (final Collection<T> collection, int index){
        return index >= collection.size() ? null : find(collection, --index, 0, collection.iterator());
    }

   public  <T extends Number> Collection<T> excludeRepeatingElements(Collection<T> collection, Iterator<T> iterator){
        final T nextValue = iterator.next();
        collection.removeAll(new ArrayList<T>(){{
            add(nextValue);
        }});
        collection.add(nextValue);
        return iterator.hasNext()? excludeRepeatingElements(collection,iterator) : collection;
    }

   public  <T extends Number> Collection<T> excludeRepeatingElements(Collection<T> collection){
        List<T> list = new ArrayList<T>(){{
            addAll(collection);
        }};
        return excludeRepeatingElements(list, collection.iterator() );
    }

}
