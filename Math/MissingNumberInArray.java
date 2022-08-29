package Solving_Problems_using_java.Math;

//Problem Statement

//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
//
//        Example 1:
//
//        Input:
//        N = 5
//        A[] = {1,2,3,5}
//        Output: 4

public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        System.out.println("Missing number is: " + MissingNumber(arr,arr.length));
    }

    public static int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum = sum + array[i];
        }
        int num = n * (n+1) / 2;
        return num-sum;
    }
}
