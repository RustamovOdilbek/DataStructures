package com.queue;

import java.util.Arrays;
import java.util.Stack;

public class SackQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        if (stack1.isEmpty()) return -1;

        int item;
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        item = stack2.pop();

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return item;
    }

    public void print(){
        System.out.println(Arrays.toString(stack1.toArray()));
    }

}
