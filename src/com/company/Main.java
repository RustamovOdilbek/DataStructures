package com.company;


import com.queue.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue();

        queue.enqueue(555);
        queue.enqueue(555);
        queue.enqueue(555);
        queue.enqueue(555);


        queue.dequeue();

        queue.print();

    }
}