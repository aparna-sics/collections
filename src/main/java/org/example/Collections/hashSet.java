package org.example.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class hashSet {
    public static void main(String[] args) {

        //adding element
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("TVM");
        hashSet.add("Kollam");
        hashSet.add("Kochi");
        System.out.println(hashSet);

        //Iterating over hashset
        for (String i:hashSet){
            System.out.println(i);
        }
//number of elements in set
        System.out.println(hashSet.size());

        List<String> arr=new ArrayList<>();
        arr.toArray();
    //remove all elements
        System.out.println(hashSet.removeAll(hashSet));

        //check if empty or not
        if(hashSet.isEmpty()){
            System.out.println("empty");
        }else {
            System.out.println(" not empty");

        }

    }
}
