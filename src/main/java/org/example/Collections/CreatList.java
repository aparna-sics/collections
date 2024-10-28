package org.example.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CreatList {
    public static void main(String[] args) {

        //creating an arrayList
        ArrayList<String> colors=new ArrayList<>();
        ArrayList<String> copy=new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Blue");
        System.out.println(colors);

        //Iterating over a list
        for(String i:colors){
            System.out.println(i);
        }
        //adding element to a specific index
        colors.add(0,"Green");
        System.out.println(colors);

        //getting an element from a particular index
        System.out.println(colors.get(3));

        //updating an array element to new value
        colors.set(3,"Black");
        System.out.println(colors);

        //removing a particular element from list
        colors.remove(3);
        System.out.println(colors);

        //Searching a particular element
        if(colors.contains("Red")){
            System.out.println("found");
        }
        else {
            System.out.println("Not found");
        }

        //sort a list
        Collections.sort(colors);
        System.out.println(colors);

        //copying the elements to another list
        copy.addAll(colors);
        System.out.println(copy);

        //for shuffling elements
        Collections.shuffle(colors);
        System.out.println(colors);

        //reverse a list
        Collections.reverse(colors);
        System.out.println(colors);

        //Particular portions in a list
        List<String> subarray=colors.subList(1,3);
        System.out.println(subarray);

        //Comparing two arraylists

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Green");
        list2.add("Red");
        list2.add("White");
        list2.add("Blue");

        System.out.println(list2);

        boolean yes=colors.equals(list2);
        boolean no=colors.equals(list2);

        System.out.println(yes);
        System.out.println(no);

        //Swapping two elements
        Collections.swap(colors,2,3);
        System.out.println(colors);

        //Joining two Arrays
        ArrayList<String> join=new ArrayList<>();
        join.addAll(colors);
        join.addAll(list2);
        System.out.println(join);

    }
}
