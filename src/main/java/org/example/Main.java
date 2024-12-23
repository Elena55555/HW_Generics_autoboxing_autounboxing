package org.example;

import static org.example.Arrays.*;

public class Main {
    public static void main(String[] args) {

        taskOne();
        taskTwo();}

    public static void taskOne() {

        System.out.println("The first task");
        int [] a  = { 1, 2, 3 };
        int [] b  = { 1, 2, 3 };
        int [] c  = { 5, 42, 4 };
        String [] arr = {"HI","MY","name","is","Nikhil"};
        System.out.println(areArrays(a,b));
        System.out.println(areArrays(a,c));
        System.out.println(getIndexOfWord(arr, "is"));
        System.out.println(arrayContainsWord(arr, "ayush"));
    }
    public static void taskTwo() {


        System.out.println("The second task");
        Integer[] integersOne = {1, 2, 3, 4, 5};
        System.out.println("The transmitted array: ");
        printArray(integersOne);
        /**
         Indexes of the elements that need to be swapped
         */
        int index1 = 0, index2 = 4;
        swap(integersOne, index1, index2);
        System.out.println("Swapped array locations: ");
        printArray(integersOne);


    }

    /**
     * Method for changing the array
     * @param integersOne
     * @param index1
     * @param index2
     */
        public static void swap(Integer [] integersOne, Integer index1, Integer index2) {
        Integer temp = integersOne [index1];
        integersOne [index1] = integersOne [index2];
        integersOne [index2] = temp;
    }

    /**
     * Method for printing an array
     * @param arr
     */

    public static void printArray(Integer[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }







}