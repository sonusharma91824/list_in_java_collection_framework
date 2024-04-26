package ListPrograms;

import java.util.ArrayList;
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(7);
        li.add(7);
        li.add(7);
        li.add(7);
        li.add(7);
        li.add(7);
        li.add(7);
        li.add(7);

            System.out.println("LISTITERATOR");
            ListIterator<Integer> it = li.listIterator();{
            while (it.hasNext()) {
                System.out.println(it.next());
            }


            System.out.println("ITERATOR");
            Iterator<Integer> II = li.iterator();
        {
            while (II.hasNext()) {
                System.out.println(II.next());
            }
        }
            System.out.println("STREAM");
             li.stream().forEach(System.out::println);
        }

            System.out.println("FOR LOOP");
             for(int i=0;i<li.size();i++)
             {
                 System.out.println(li.get(i));
             }


            System.out.println("FOREACH LOOP");
             for (Integer s : li)
             {
                 System.out.println(s);
             }


        }
    }

