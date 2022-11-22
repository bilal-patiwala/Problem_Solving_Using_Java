package Solving_Problems_using_java.Array;

//Problem Statement
//Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer.
//        Example 1:
//
//        Input:
//        N = 5, D = 2
//        arr[] = {1,2,3,4,5}
//        Output: 3 4 5 1 2
//        Explanation: 1 2 3 4 5  when rotated
//        by 2 elements, it becomes 3 4 5 1 2.

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
        int d = 69;
        int[] temp = new int[d];
        for(int i=0; i<d; i++) {
            temp[i] = arr[i];
        }
        int k = 0;
        int j = d;
        while(k != arr.length-d){
            arr[k] = arr[j];
            j++;
            k++;
        }
        for(int i=0;i<d;i++){
            arr[arr.length-d+i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
