import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RecursiveElementFinder {

    private <T extends Number> T find(final Collection<T> collection, final int index, int startPos, Iterator<T> iterator) {
        iterator.next();
        return index == startPos ? iterator.next() : find(collection, index, ++startPos, iterator);
    }

    public <T extends Number> T find(final Collection<T> collection, int index) {
        return index >= collection.size() ? null : find(collection, --index, 0, collection.iterator());
    }

}
