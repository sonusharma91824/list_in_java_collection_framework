package ListPrograms;

import java.util.List;

public class ELemntInTheIndexNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,6,77,2,56,7);
           for(int i=0;i<list.size();i++)
           {
              if(i==3){
                  System.out.println(list.get(i));
              }
           }




    }
}
