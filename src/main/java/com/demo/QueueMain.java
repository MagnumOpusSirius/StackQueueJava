package com.demo;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue customQueue= new CustomQueue();

        customQueue.insert(1);
        customQueue.insert(2);
        customQueue.insert(3);

        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());

        System.out.println(customQueue.peek());



    }
}
