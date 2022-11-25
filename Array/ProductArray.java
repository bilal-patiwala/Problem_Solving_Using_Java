package Solving_Problems_using_java.Array;

import java.util.Arrays;
/*
* Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].



Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation:
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
*
* */

public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {12,0};
        int[] p = new int[nums.length];
        for(int i=0;i< nums.length; i++){
            if(i>0 && i< nums.length-1){
                p[i] = product(Arrays.copyOfRange(nums,0,i)) * product(Arrays.copyOfRange(nums,i+1,nums.length));
            }
            if(i==0){
                p[i] = product(Arrays.copyOfRange(nums,i+1,nums.length));
            }
            if (i == nums.length-1){
                p[i] = product(Arrays.copyOfRange(nums,0,nums.length-1));
            }
        }
        System.out.println(Arrays.toString(p));
    }

    public static int product(int[] arr){
        int product = 1;
        for(int i=0; i< arr.length;i++){
            product = product * arr[i];
        }
        return product;
    }
}
