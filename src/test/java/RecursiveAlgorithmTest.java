import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RecursiveAlgorithmTest {
    private List<Integer> list1 = new ArrayList<>();
    private RecursiveAlgorithm recursiveAlgorithm = new RecursiveAlgorithm();

    @Before
    public void setList1(){
        list1.add(5);
        list1.add(55);
        list1.add(555);
        list1.add(55);
        list1.add(5);
        list1.add(5);
        list1.add(5);
    }

    @Test
    public void find() {
       int elem5 = recursiveAlgorithm.find(list1,5);
       assertEquals(elem5,5);
    }

    @Test
    public void excludeRepeatingElements() {

      List<Integer> result = new ArrayList<Integer>() {{
          addAll(recursiveAlgorithm.excludeRepeatingElements(list1));
      }};
        List<Integer> listWithoutRepeatingElems = new ArrayList<>();
        listWithoutRepeatingElems.add(555);
        listWithoutRepeatingElems.add(55);
        listWithoutRepeatingElems.add(5);

        assertArrayEquals(listWithoutRepeatingElems.toArray(),result.toArray());

    }
}