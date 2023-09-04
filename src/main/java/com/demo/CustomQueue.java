package com.demo;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE= 10; //defined length

    int ptr=0;//set a current default pointer
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        //create an object of that custom size and set it to the size of our data array.
        this.data=new int[size];
    }

    public void insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!!");
            return;
        }
        //insert the value to array
        data[ptr]=item;
        ptr++;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!!");
        }
        //remove the first item from the queue
        int remove = data[0];
        //then shift the queue one item to the left.
        for(int i =1; i<ptr; i++){
            //shift it to the left
            data[i-1]=data[i];
        }
        ptr--;
        return remove;
    }

    //checks if the queue is full
    public boolean isFull(){
        //set the pointer to the end of the array.
        return ptr==data.length;
    }

    public boolean isEmpty(){
        //set the pointer to the start of the array.
        return ptr==0;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty!!!");
        }
        return data[0];
    }

}
