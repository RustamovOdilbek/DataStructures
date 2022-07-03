package com.queue;

public class PriorityQueue {

    private int[] items;
    private int count;

    public PriorityQueue(){
        items = new int[10];
    }

    public void enqueue(int item){
        if (count == items.length){
            int[] newItems = new int[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count++] = item;
    }

    public int dequeue(){
        if (count <= 0)    throw new IllegalArgumentException();
        return items[--count];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void print(){
        if (count == 0){
            System.out.println("[]");
        }else {
            StringBuilder print = new StringBuilder("[");
            for (int i = 0; i < count; i++){
                if (i != count - 1){
                    print.append(items[i]).append(", ");
                }else {
                    print.append(items[i]).append("]");
                }
            }
            System.out.println(print);
        }
    }
}
