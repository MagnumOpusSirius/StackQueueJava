package com.demo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        //what does ArrayDeque do?
        //it implements Deque interface
        //It is faster than LinkedList and Stack
        Deque<Integer> deque= new ArrayDeque<>();
        deque.add(54);
        deque.addFirst(3);

        System.out.println(deque.removeLast());
        System.out.println(deque.getLast());
    }
}
