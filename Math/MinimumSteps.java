package Solving_Problems_using_java.Math;

//Problem Statement:-

//Given an array arr[] containing N integers. In one step, any element of the array can either be increased or decreased by one. Find minimum steps required such that the product of the array elements becomes 1.
//
//
//
//        Example 1:
//
//        Input:
//        N = 3
//        arr[] = {-2, 4, 0}
//        Output:
//        5
//        Explanation:
//        We can change -2 to -1, 0 to -1 and 4 to 1.
//        So, a total of 5 steps are required
//        to update the elements such that
//        the product of the final array is 1.

public class MinimumSteps {
    public static void main(String[] args) {
        int[] arr = {-1};
        int n = arr.length;
        System.out.println(makeProductOne(arr,n));
    }
    static int makeProductOne(int[] arr, int N) {
        // code here
        int step = 0;
        int even = 0;
        int zeroes = 0;
        for (int element: arr) {
            if(element == 0){
                zeroes++;
            }
            else if(element > 0) {
                step = step + (element - 1);
            }
            else {
                even++;
                step = step + (-1 - (element));
            }
        }
        step = step + zeroes;
        if(even%2 != 0 && zeroes == 0){
            return step + 2;
        }
        return step;
    }
}
