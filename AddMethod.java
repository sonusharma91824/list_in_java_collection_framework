package ListPrograms;

import java.util.*;

public class AddMethod {
    public static void main(String[] args) {


        // type unsafe collection
        {
            List list = new ArrayList();
            list.add(23);
            list.add("sonu");
            list.add(3.4666);
            list.add('h');

            System.out.println(list);
        }
        {
            List<String> list = new LinkedList<>();
            list.add("rahul");
            list.add("sonu");
            list.add("meena");
            list.add("seema");

            System.out.println(list);
        }
        {
            List<Integer> list = new Vector<>();
            list.add(78);
            list.add(89);
            list.add(34);
            list.add(12);

            System.out.println(list);
        }
        {
            Stack<Integer> list= new Stack<Integer>();
            list.push(78);
            list.push(45);

            System.out.println(list);

        }

    }
}
