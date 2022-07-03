package com.stack;

import java.util.Arrays;

public class Stack {

    int[] items;
    private int count;


    public Stack() {
        items = new int[10];
    }

    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

    //Time Complexity (n)
    public void push(int item) {
        if (count == items.length) {

            int[] newItems = new int[count * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count++] = item;
    }

    //Time Complexity (1)
    public int peek(){
        if (count == 0){
            throw new IllegalStateException();
        }

        return items[count - 1];
    }

    //Time Complexity (1)
    public int pop(){
        if (count == 0){
            throw new IllegalStateException();
        }
        return items[--count];
    }

    //Time Complexity (n)
    public int max(){
        if (count == 0){
            throw new IllegalStateException();
        }

        int max = items[0];
        for (int i = 0; i <= count; i++){
            if (max < items[i])
                max = items[i];
        }
        return max;
    }

    //Time Complexity (n)
    public int min(){
        if (count == 0){
            throw new IllegalStateException();
        }

        int min = items[0];
        for (int i = 0; i <= count; i++){
            if (min > items[i])
                min = items[i];
        }
        return min;
    }
}
