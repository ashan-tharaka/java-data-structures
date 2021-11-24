package com.ashan;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class TheLinkedLists {
    public static void main(String[] args) {
        LinkedList<TheQueue.Person>linkedList=new LinkedList<>();
        linkedList.add(new TheQueue.Person("ashan",20));
        linkedList.add(new TheQueue.Person("ashan1",20));
        linkedList.addFirst(new TheQueue.Person("ali",22));
        ListIterator<TheQueue.Person>personListIterator=linkedList.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());

        }
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());

        }



    }
    private static void queues(){
        Queue<TheQueue.Person> supermarket=new LinkedList<>();
        supermarket.add(new TheQueue.Person("ashan",2));
        supermarket.add(new TheQueue.Person("akila",21));
        supermarket.add(new TheQueue.Person("Nimal",22));
        System.out.println(supermarket.size());

        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }
}
