package ListPrograms;

import java.util.Iterator;
import java.util.List;

public class IterateListInThreeWays {
    public static void main(String[] args) {
        List<String> list = List.of("sonu","khushi","madhav","mona");
           {
               System.out.println("PRINT WITH THE HELP OF ITERATOR");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
               System.out.println("PRINT WITH THE HELP OF FOR LOOP");
               {
                   for (int i=0;i< list.size();i++)
                   {
                       System.out.println(list.get(i));
                   }
               }
               System.out.println("PRINT WITH THE HELP OF FOR EACH ");
               {
                   for(String li :list)
                   {
                       System.out.println(li);
                   }
               }
               System.out.println("PRINT WITH THE HELP OF STREAM API");
               {
                   list.stream().forEach(System.out::println);
               }
        }
    }
}
