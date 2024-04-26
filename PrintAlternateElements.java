package ListPrograms;

import java.util.List;

public class PrintAlternateElements {
    public static void main(String[] args) {
     List<Integer> list = List.of(2,4,6,7,8);
        for(int i=0;i< list.size();i++)
        {

            System.out.println(list.get(i));
                i++;
        }

    }
}
