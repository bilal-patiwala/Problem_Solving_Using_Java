package Solving_Problems_using_java.Array;

import java.util.ArrayList;
import java.util.Arrays;
/*
*
* Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number.


Example 1:

Input:
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

Example 2:

Input:
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0
Explanation : Positive elements : 5,2,4,7,1,8,0
Negative elements : -5,-2,-8
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
*
* */
public class AlternateNumbers {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        System.out.println(Arrays.toString(alternateNum(arr)));
    }

    public static int[] alternateNum(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int p = 0;
        int N = 0;
        int k = 0;
        for (int i=0; i< arr.length;i++){
            if(arr[i] < 0){
                neg.add(arr[i]);
            }
            if(arr[i] >= 0){
                pos.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            k=i;
            if(i%2 == 0){
                if(p == pos.size()){
                    break;
                }
                arr[i] = pos.get(p);
                p++;
            }
            if(i%2 != 0){
                if(N == neg.size()){
                    break;
                }
                arr[i] = neg.get(N);
                N++;
            }
        }
        while (p != pos.size()){

            arr[k] = pos.get(p);
            p = p +1;
            k = k+1;
        }
        while (N != neg.size()){

            arr[k] = neg.get(N);
            N = N +1;
            k = k+1;
        }
        return arr;

    }
}
