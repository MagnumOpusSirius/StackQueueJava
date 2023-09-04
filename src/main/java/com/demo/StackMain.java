package com.demo;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack customStack = new DynamicStack(5);

        customStack.push(2);
        customStack.push(4);
        customStack.push(6);
        customStack.push(8);
        customStack.push(10);
        customStack.push(24);


        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());

    }
}
