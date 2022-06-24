package com.arraylist;

/**
 * Arrayni kamchiliklari: size oldindan berish kerak, remove funksiyasi yo'q
 *
 * Disadvantages of the array: you have to give "length", there is no remove function
 */

/**
 * ArrayList ni length ni oldindan berish shart emas va remove funksiyasi bor
 * Kamchiliklari: remove funksiyasi elementni xotiradan o'chirmaydi
 *
 * ArrayList does not need to be pre-defined in length and has a remove function
 * Disadvantages: The remove function does not delete an item from memory
 */
public class ArrayList {

    private int[] items;
    private int count = 0;

    public ArrayList(){
        items = new int[1];
    }

    //Time Complexity (n2)
    public ArrayList intersect(int[] array){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++){
            for (int j = 0; j < array.length; j++){
                if (items[i] == array[j] && arrayList.indexOf(items[i]) == -1){
                        arrayList.add(items[i]);
                }
            }
        }
        return arrayList;
    }

    //Time Complexity (n)
    public void reverse(){
        for (int i = 0; i < (count + 1)/ 2; i++){
            int item = items[i];
            items[i] = items[count - 1 - i];
            items[count - i - 1] = item;
        }
    }

    //Time Complexity (n)
    public int min(){
        int max = items[0];
        for (int i = 0; i < count; i++){
            if (max > items[i]){
                max = items[i];
            }
        }
        return max;
    }

    //Time Complexity (n)
    public int max(){
        int max = items[0];
        for (int i = 0; i < count; i++){
            if (max < items[i]){
                max = items[i];
            }
        }
        return max;
    }

    //Time Complexity (0)
    public void removeAll(){
        count = 0;
    }

    //Time Complexity (n)
    public void removeAt(int index){
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }

    //Time Complexity (n)
    public void insertAt(int item, int index){
        if (index > count){
            throw  new IndexOutOfBoundsException();
        }else {
            if (items.length == count){
                int[] newItems = new int[count * 2];
                for (int i = 0; i < items.length; i++){
                    newItems[i] = items[i];
                }
                items = newItems;
            }
            for (int i = count - 1; i >= index; i--){
                items[i + 1] = items[i];
            }
            count++;
            items[index] = item;
        }
    }

    //Time Complexity (n)
    public int indexOf(int item){
        for (int i = 0; i < count; i++){
            if (items[i] == item) return i;
        }
        return -1;
    }

    //Time Complexity (n)
    public void add(int item){
        if (items.length == count){
            int[] newItems = new int[count * 2];
            for (int i = 0; i < items.length; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    //Time Complexity (n)
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
