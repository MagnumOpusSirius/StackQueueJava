package com.demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExample {

    public static void main(String[] args) {
        //generics
        //stack variable is in stack memory = creation of the object is in heap memory
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}