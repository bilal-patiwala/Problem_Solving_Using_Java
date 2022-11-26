package Solving_Problems_using_java.Sorting;

import java.util.Arrays;

/*
* Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

If there are multiple solutions, find the lexicographically smallest one.

Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after
sorting it in wave form are
2 1 4 3 5.
Example 2:

Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after
sorting it in wave form are
4 2 8 7 10 9.
*
* */

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        if(n%2 != 0){
            for(int i=0;i<arr.length;i=i+2){
                if(i != arr.length-1){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        else{
            for(int i=0;i<arr.length;i=i+2){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
