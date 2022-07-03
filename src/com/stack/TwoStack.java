package com.stack;

public class TwoStack {

    private int[] items;
    private int count1, count2;

    public TwoStack(int n){
        items = new int[n];
        count1 = 0;
        count2 = n / 2;
    }

    //Time Complexity (1)
    public boolean isEmpty1(){
        return count1 == 0;
    }

    //Time Complexity (1)
    public boolean isEmpty2(){
        return count2 == items.length / 2;
    }

    //Time Complexity (1)
    public boolean isFull1(){
        return count1 == items.length / 2;
    }

    //Time Complexity (1)
    public boolean isFull2(){
        return count2 == items.length;
    }

    //Time Complexity (1)
    public void push1(int item){
        if (count1 == items.length / 2){
            throw new StackOverflowError();
        }
        items[count1++] = item;
    }

    //Time Complexity (1)
    public void push2(int item){
        if (count2 == items.length){
            throw new StackOverflowError();
        }
        items[count2++] = item;
    }

    //Time Complexity (n)
    public void print(){
        for (int i = 0; i < count1; i++){
            System.out.print(items[i] + " ");
        }

        for (int i = count1 + 1; i < count2; i++){
            System.out.print(items[i] + " ");
        }
    }

    //Time Complexity (1)
    public int pop1(){
        if (count1 == 0){
            throw new IllegalStateException();
        }
        return items[--count1];
    }

    //Time Complexity (1)
    public int pop2(){
        if (count2 == items.length / 2){
            throw new IllegalStateException();
        }
        return items[--count2];
    }
}
