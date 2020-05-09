package academy.learnprogramming;
/*==========================================
Title:  Udemy Reverse Array Challenge
Author: Johan Danmo
Date:   9 Mar 2020
==========================================*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        System.out.println("The original order of the array is " + Arrays.toString(array));
        reverse(array);
        System.out.println("The reversed order of the array is " + Arrays.toString(array));
    }

    public static void reverse(int[] array){
        //This method will reverse the order of the numbers in the input array
        int[] tempArray = Arrays.copyOf(array, array.length); //create a copy of the input array
        for (int i = array.length-1; i >= 0; i--){
            array[array.length-i-1] = tempArray[i]; //assign the contents of the copied array to array in reversed order
        }
    }
}
