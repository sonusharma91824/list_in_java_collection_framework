package ListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import java.util.LinkedList;

public class  ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> li = new ArrayList<>();

        li.add("ram");
        li.add("sharma");
        li.add("27");
        li.add("ram");
        li.add("anoop nagar");
        li.add("7567");
        li.add("678.76543");
        System.out.println(li);  // [ram, sharma, 27, anoop nagar, 7567, 678.76543]
        {
            li.remove(2);
            li.remove(3);
            System.out.println(li); // [ram, sharma, anoop nagar, 678.76543]
        }
        {
            System.out.println(li.get(2)); //anoop nagar
        }
        {
            System.out.println(li.getFirst()); // ram
        }
        {
            System.out.println(li.getLast()); //678.76543
        }
        {
            System.out.println(li.indexOf("sharma")); // 1
        }
        {
            System.out.println(li.isEmpty()); // false
        }
        {
            System.out.println(li.lastIndexOf("ram"));  // 0
        }
        {
            System.out.println(li.size());  // 4
        }
        {
            System.out.println(li);  // [ram, sharma, anoop nagar, 678.76543]
            System.out.println("anoop nagar prfesents in the list  =  " + li.contains("anoop nagar"));  //anoop nagar prfesents in the list  =  true
            // this method print true if "anoop nagar" is present in the arrylist and print falsae if it is not present in the arraylist
            System.out.println("3 is present in the list  =  " + li.contains(3));   //3 is present in the list  =  false

        }
        {
            Object[] ary = li.toArray();
            for (int i = 0; i <= ary.length - 1; i++) {
                System.out.println(ary[i]);      //ram
                //sharma
                //anoop nagar
                //678.76543

            }
        }
        Object[] ary1 = li.toArray();
        for (Object ele : ary1) {
            System.out.println(ele);       //ram
            //sharma
            //anoop nagar
            //678.76543

        }
        {
            //  li.clear();
            // System.out.println(li);
        }
        {
            System.out.println();
        }


        {
            ArrayList al = new ArrayList();
            al.add("jbv");
            al.add(678);

            System.out.println(al); // [jbv, 678]


            {
                li.addAll(al);
                System.out.println(li); // [ram, sharma, anoop nagar, 678.76543, jbv, 678]

            }
            {
                al.addAll(li);
                System.out.println(al);  // [jbv, 678, ram, sharma, anoop nagar, 678.76543, jbv, 678]
            }
            {
                al.addFirst("First elem");
                System.out.println(al); //[876, jbv, 678, ram, sharma, anoop nagar, 678.76543, jbv, 678]
            }
            {
                al.addLast("second last elem" + " , " + "last elem");
                System.out.println(al);  // [876, jbv, 678, ram, sharma, anoop nagar, 678.76543, jbv, 678, second last elem , last elem]
            }
            {
                al.removeFirst();
                System.out.println(al);
                // [jbv, 678, ram, sharma, anoop nagar, 678.76543, jbv, 678, second last elem , last elem]
            }
            {
                al.add(76543);
            }
            {
                al.set(2, "sonu");
                System.out.println(al);
// [jbv, 678, sonu, sharma, ram, 7567, 678.76543, jbv, 678, second last elem , last elem, 76543]
            }
            {
                Collections.reverse(li);
                System.out.println(li);   // [678, jbv, 678.76543, 7567, ram, sharma, ram]
            }
            {
                LinkedList ll = new LinkedList();
                ll.add(67);
                ll.add(78);
                ll.add(34);
                ll.add(98);
                ll.add(2);
                ll.add(100);
                System.out.println(ll);  // [67, 78, 34, 98, 2, 100]


                Collections.sort(ll);

                System.out.println("here the sorted linked list = " + ll);  // here the sorted linked list = [2, 34, 67, 78, 98, 100]

                {
                    for (Object in : ll) {
                        System.out.println(ll);
                    }

                }

                Iterator it = ll.iterator();
                while (it.hasNext()) {    // contain any next item it will go inside the while loop
                    System.out.println(it.next()+",");
                    //  System.exit(10);}

                }

            }
        }}}

