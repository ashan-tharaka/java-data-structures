package com.ashan;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors=new String[5];
        colors[0]="Purple";
        colors[1]="Blue";
        colors[2]="White";

        System.out.println(colors[1]);
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[2]);
        System.out.println(colors[4]);
        colors[3]="Black";
        System.out.println(Arrays.toString(colors));

        int[] numbers={100,200};

        /*new int[2];
        numbers[0]=100;
        numbers[1]=200;
        */
        System.out.println(Arrays.toString((numbers)));
        for (int i=0;i<colors.length;i++){
            System.out.println(colors[i]);

        }
        for (int i=colors.length-1;i>=0;i--){
            System.out.println(colors[i]);

        }
        System.out.println(colors.length);
        for(String color:colors){
            System.out.println(color);

        }
        Arrays.stream(colors).forEach(System.out::println);









    }
}
