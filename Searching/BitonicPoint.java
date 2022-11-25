package Solving_Problems_using_java.Searching;

/*
* Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum value.

Example 1:

Input:
n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.
* */

public class BitonicPoint {
    public static void main(String[] args) {
        int[] arr = {1,15,25,45,42,21,17,12,11};
        System.out.println(bitonicPoint(arr));
    }
    public static int bitonicPoint(int[] arr){
        int max = arr[0];
        for(int i=1;i< arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
