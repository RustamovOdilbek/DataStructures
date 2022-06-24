package com.company;

public class Main {

    public static void main(String[] args) {


        var array = new int[3];
        array[0] = 1;
        array[1] = 3;
        array[2] = 2;


        int a = 0;
        int b = 0;


        for(int i = 0; i < array.length-1; i++){
            if(array[i] <= array[i + 1]){
                a++;
            }else if(array[i] > array[i + 1]){
                b++;
            }
        }

        System.out.println(array.length);

        System.out.println(a);
        System.out.println(b);






    }
}
