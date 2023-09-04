package com.demo;

public class CustomStack {

    protected int[] data; //internally stack works as array -- so create an array

    private static final int DEFAULT_SIZE= 10; //defined length

    int ptr=-1;//set a current default pointer
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        //create an object of that custom size and set it to the size of our data array.
        this.data=new int[size];
    }
    //to maintain the method properties like push(int n), pop()

    //push(): does not return anything, just checks if the value was successfully added.
    public boolean push(int elem){
        //if pointer is at end of stack is full.
        if(isFull()){
            System.out.println("Stack is Full!!!");
            return false;
        }
        ptr++;
        data[ptr]= elem;
        return true;
    }
    //pop(): returns the value from stack
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack!!!");
        }
        int elem=data[ptr];
        ptr--;
        return elem;
    }
    //peek(): returns the head/top of the stack
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from empty stack!!!");
        }
        return data[ptr];
    }


    //checks if the stack is full
    public boolean isFull(){
        //set the pointer to the end of the array.
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        //set the pointer to the start of the array.
        return ptr==-1;
    }


}
