package com.ashan;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Thesets {
    public static void main(String[] args) {
        Set<Ball> balls=new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("Green"));
        balls.remove(new Ball("red")) ;
        balls.forEach(System.out::println);
        System.out.println(balls.size());

    }
    static class Ball{
        String color;

        public Ball(String color){
            this.color=color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

}
