package com.demo;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        //if it is full, just put that array items into another array with 2 times the size.
        if(isFull()){
            //double the array size
            int[] temp= new int[data.length*2];

            //copy all the previous items in new array;
            for(int i =0; i< data.length; i++){
                temp[i]= data[i];
            }
            data=temp;
        }

        return super.push(item);
    }
}
