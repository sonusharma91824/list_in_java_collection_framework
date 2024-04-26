package ListPrograms.ArrayList;

import java.util.ArrayList;

import static javax.management.Query.or;

public class IterateWithForLoop {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
           arrayList.add("sonu");
           arrayList.add("nonu");
           arrayList.add("khushi");
           arrayList.add("madhav");

           for (int i=0; i< arrayList.size();i++)
           {
               System.out.println(arrayList.get(i));
           }
        }
    }

