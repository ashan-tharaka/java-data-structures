package com.ashan;

import java.util.HashMap;
import java.util.Map;

public class TheMap {
    public static void main(String[] args) {
        Map<Integer, Person>map=new HashMap<>();
        map.put(1,new Person("Alex") );
        map.put(2,new Person("Ashan"));
        map.put(3,new Person("tharaka"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());







    }
    record Person(String name){


    }
}
