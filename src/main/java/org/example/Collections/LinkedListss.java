package org.example.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListss {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        //adding elements
        list.add("Parrot");
        list.add("Crow");
        list.add("Sparrow");
        list.add("Eagle");
        System.out.println(list);

        //iterate over list
        for (String i:list){
            System.out.println(i);
        }

        //iterate from a particular position
        Iterator iterator= list.listIterator(1);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //iterate in reverse order
        Iterator rev= list.descendingIterator();
        while (rev.hasNext()){
            System.out.println(rev.next());
        }

        //adding an element
        list.add(4,"Myna");
        System.out.println(list);

        //Adding elements on first and last
        list.addFirst("peacock");
        list.addLast("KingFisher");
        System.out.println(list);

        //Converting a LinkedList to ArrayList
        List<String> arrayList = new ArrayList<String>(list);

        for (String str : arrayList){
            System.out.println(str);
        }
    }
}
