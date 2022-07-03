package com.queue;

public class ArrayQueue {

    private int[] items;
    private int rear;

    public ArrayQueue(){
        items = new int[2];
    }

    public void enqueue(int item){
        if (rear == items.length){
            int[] newItems = new int[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        items[rear++] = item;
    }

    public int dequeue(){
        var item = items[0];
        for (int i = 0; i < rear; i++){
            items[i] = items[i + 1];
        }
        rear--;
        return item;
    }

    public void print(){
        if (rear == 0){
            System.out.println("[]");
        }else {
            StringBuilder print = new StringBuilder("[");
            for (int i = 0; i < rear; i++){
                if (i != rear - 1){
                    print.append(items[i]).append(", ");
                }else {
                    print.append(items[i]).append("]");
                }
            }
            System.out.println(print);
        }
    }

    public int size(){
        return rear;
    }

}
