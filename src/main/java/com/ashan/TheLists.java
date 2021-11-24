package com.ashan;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<String>();
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");


        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Black"));
        for (String color:colors){
            System.out.println(color);

        }
        colors.forEach(System.out::println);
        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));

        }
      List<String> colors1= List.of(
                "blue","yellow"
        );
        colors1.add("Pink");






    }
}
