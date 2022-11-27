package Solving_Problems_using_java.Sorting;


import java.util.ArrayList;
import java.util.Collections;

/*
* Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between
maximum chocolates and minimum chocolates
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}.
* */

public class ChocolateDistribution {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(4);
        arr1.add(1);
        arr1.add(9);
        arr1.add(56);
        arr1.add(7);
        arr1.add(9);
        arr1.add(12);
        int m = 5;
        int min = Integer.MAX_VALUE;
        Collections.sort(arr1);
        for(int i=0; i+m-1<arr1.size();i++){
            if(min > arr1.get(i+m-1) - arr1.get(i)){
                min = arr1.get(i+m-1) - arr1.get(i);
            }
        }
        System.out.println(min);
    }
}
