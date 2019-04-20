import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(55);
        list1.add(555);
        list1.add(55);
        list1.add(5);
        list1.add(5);
        list1.add(5);


        System.out.println(RecursiveAlgorithms.find(list1,5));

        System.out.println(RecursiveAlgorithms.excludeRepeatingElements(list1));

        List<Integer> list2 = new ArrayList<Integer>(){{
            addAll(list1);
        }};

        System.out.println(StreamAPI.excludeRepeatingElements(list2));
    }
}
