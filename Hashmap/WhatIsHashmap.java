// What is HashMap - A hashmap is a datastructure which is used to store the data in key/value pairs, and you can access them by an index of another type (e.g., String). 
// One object is used as a key(index) to another object(value). It can store different types: String keys and Integer values, or the same type: like String keys and String values.

import java.util.*;

public class WhatIsHashmap {
    public static void main(String[] args) {

        // Hashmap Declaration
        // HashMap <String, String> map = new HashMap<>();

        // Add items/data in Hashmap key: Country and value: Capital
        // map.put("India", "Delhi");
        // map.put("Australia", "Canberra");
        // System.out.println(map);

        // Access an item
        // System.out.println(map.get("India"));

        // Remove an item
        // System.out.println(map.remove("Australia"));

        // Remove all items
        // map.clear();
        // System.out.println(map);

        // HashMap size
        // System.out.println("HashMap size: " + map.size());

        // LOOP THROUGH HASHMAP

        // 1. Loop through the items of Hashmap using for-each loop.
        // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

        // for(String i : map.keySet()){
        //     System.out.println(i);
        // }

        // for(String i : map.values()){
        //     System.out.println(i);
        // }

        // print key and values together
        // for(String i : map.keySet()) {
        //     System.out.println("key: " + i + " value: " + map.get(i));
        // }

        HashMap <Integer, Integer> map2 = new HashMap<>();
        map2.put(1,4);
        map2.put(4,6);
        
        // Traverse through map and print frequencies - this is the most preferred way to traverse through HashMap using for-each loop.
        for (Map.Entry<Integer,Integer> entry : map2.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}