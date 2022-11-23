package Solving_Problems_using_java.Array;

import java.util.Arrays;

/*
* Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.


Example 1:

Input:
N = 3
A[] = {1,2,3}
Output:
-1
Explanation:
Since, each element in
{1,2,3} appears only once so there
is no majority element.
*
*
Example 2:

Input:
N = 5
A[] = {3,1,3,3,2}
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is
the majority element.
*
*
* */

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,13};
        Arrays.sort(arr);
        int[] count = new int[arr[arr.length-1]+1];
        for(int i=0;i<arr.length;i++){
            if(count[arr[i]]==0){
                count[arr[i]] = 1;
            }
            else {
                count[arr[i]] = count[arr[i]] + 1;
            }
        }
        for(int i=0;i< count.length;i++){
            if(count[i] > arr.length/2){
                System.out.println(i);
            }
        }

    }
}
