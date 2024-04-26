package ListPrograms;

import java.util.List;

public class EvenAndOdd {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("print even numbers from hte list");
       for(Integer n:list)
       {
           if(n%2==0)
           {
               System.out.print(n+",");
           }
       }
        System.out.println();
        System.out.println("print odd number from the list");
       for(Integer m : list)
       {
           if(m%2!=0)
           {
               System.out.print(m+",");
           }

       }


    }
    }

