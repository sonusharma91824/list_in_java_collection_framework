package ListPrograms;

import java.util.List;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        int j=0;
        for (Integer i : list){
            if(i%2==0)
             {
                j=j+i;
             }
        }
        System.out.println("Sum of all even numbers in the list is "  + j);
    }
}
