package com.linkedlist;

import java.util.NoSuchElementException;

/**
 * ArrayListni kamchilikgi elementni xotiradan o'chirmaydi
 *
 * An ArrayList defect does not delete an item from memory
 */

/**
 * LinkedList elementni xotiradan to'liq o'chiradi
 *
 * LinkedList completely deletes the item from memory
 */

public class LinkedList {

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

    //Time Complexity (n2)
    public void reverse(){
        var current = first;
        var perevious = last;
        for (int i = 0; i <= (size - 1) / 2; i++){
            var res = current.value;
            current.value = perevious.value;
            perevious.value = res;
            current = current.next;
            perevious = getPerevious(perevious, size - i);
        }
    }

    //Time Complexity (n)
    public int getKthFromEnd(int k){
        var current = first;
        for (int i = 0; i < size - k; i++){
            if (i == size - k - 1){
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    //Time Complexity (n)
    public void printMiddle(){
        var current = first;
        for (int i = 0; i <= (size - 1) / 2; i++){
            if (i == (size - 1) / 2){
                System.out.println(current.value);
            }
            current = current.next;
        }
    }

    //Time Complexity (n2)
    public int lastIndexof(int item){
        var index = 0;
        var perevious = last;
        while (perevious != null){
           if (perevious.value == item){
               return index;
           }
           perevious = getPerevious(perevious, size - index);
            index++;
        }
        return -1;
    }

    //Time Complexity (n)
    public boolean search(int item){
        var current = first;
        while (current != null){
            if (current.value == item){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //Time Complexity (n)
    public int[] toArray(){
        var array = new int[size];
        var current = first;
        var index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    //Time Complexity (1)
    public int size(){
        return size;
    }

    //Time Complexity (n)
    public void removeLast(){
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last){
            first = last = null;
        }else {
            var perevious = getPerevious(last, size);
            last = perevious;
            last.next = null;
        }
        size--;
    }

    //Time Complexity (n)
    private Node getPerevious(Node node, int length){
        var current = first;
        for (int i = 0; i < length - 2; i++){
            current = current.next;
        }
        return current;
    }

    //Time Complexity (1)
    public void removeFirst(){
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last){
            first = last = null;
        }else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    //Time Complexity (n)
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    //Time Complexity (n)
    public int indexOf(int item){
        var index = 0;
        var current = first;
        while (current.next != null){
            if (current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    //Time Complexity (1)
    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }else {
            node.next = first;
            first = node;
        }
        size++;
    }

    //Time Complexity (1)
    public void addLast(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }else {
            last.next = node;
            last = node;
        }
        size++;
    }

    //Time Complexity (n)
    public void print(){
        Node temp = first;
        System.out.print("[");
        while (temp != null){
            if (temp.next != null) {
                System.out.print(temp.value + ", ");
            }else {
                System.out.print(temp.value);
            }
            temp = temp.next;
        }
        System.out.println("]");
        System.out.println();
    }

    //Time Complexity (1)
    public boolean isEmpty(){
        return first == null;
    }
}
