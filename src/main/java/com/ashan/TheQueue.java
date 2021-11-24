package com.ashan;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {
        Queue<Person> supermarket=new LinkedList<>();
        supermarket.add(new Person("ashan",2));
        supermarket.add(new Person("akila",21));
        supermarket.add(new Person("Nimal",22));
        System.out.println(supermarket.size());

        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());





    }
    static record Person(String name,int age){

    }
}

