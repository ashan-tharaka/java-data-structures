package com.ashan;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

    }

    private static void maps(){
        Map<Integer, TheMap.Person> map=new java.util.HashMap<>();
        map.put(1,new TheMap.Person("Alex") );
        map.put(2,new TheMap.Person("Ashan"));
        map.put(3,new TheMap.Person("tharaka"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

    }

    record Diamond(String name){};

}
