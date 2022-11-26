package Solving_Problems_using_java.Sorting;

import java.util.Arrays;
/*
* Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated
into ascending order.
Example 2:

Input:
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated
into ascending order.
*
* */


public class SortAnArrayOf012 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid =mid + 1;
            }
            else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
                mid++;
            }
            else{
                mid = mid + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
