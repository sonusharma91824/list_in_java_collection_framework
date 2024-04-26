package ListPrograms;

import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(list.reversed());
     //   System.out.println(list);

        for(int i =list.size()-1;i>=0;i--)
        {
        }
    }
}