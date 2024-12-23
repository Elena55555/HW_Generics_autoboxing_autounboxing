package org.example;

public class Arrays {

    /** Method that takes two arrays of the same type
     * and checks if they contain the same elements in the same order.
     * @param arr1
     * @param arr2
     * @return false or true
     */
    //
    public static boolean areArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    Integer[] integersOne = {1, 2, 3, 4, 5};
    Integer[] integersTwo = {1, 2, 3, 4, 5};

    /**
     * Method that takes  array of the  type String and String word
     * and checks if they contain the same elements in the same order
     * @param arr
     * @param word
     * @return i or -1 (if found, return the index of word, otherwise return -1)
     */
    public static int getIndexOfWord(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * The method   takes array of the  type String and String word
     * and checks if they contain the same elements in the same order
     * @param arr
     * @param word
     * @return boolean true or false
     */

    public static boolean arrayContainsWord(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}
