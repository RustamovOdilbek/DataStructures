package com.queue;

public class LinkedQueue {

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    public LinkedQueue(){
        first = null;
        last = null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void print(){
        Node current = first;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public void enqueue(int item){//addLast
        Node node = new Node(item);
        if (isEmpty()){
            first = node    ;
            last = node;
        }else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int dequeue(){//removeFirst
        if (isEmpty()) return -1;
        Node second;
        if (size == 1){
            second = first;
            first = null;
            last = null;
        }else {
            second = first.next;
            first.next = null;
            first = second;
        }
        size --;
        return second.value;
    }

}
