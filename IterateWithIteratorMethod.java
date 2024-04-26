package ListPrograms.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateWithIteratorMethod {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1,3,5,6,8,8,9);

        Iterator it = arrayList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
