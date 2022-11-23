package Solving_Problems_using_java.Array;

import java.util.*;

/*
* Given a non-negative number represented as a list of digits, add 1 to the number (increment the number represented by the digits). The digits are stored such that the most significant digit is first element of array.


Example 1:

Input:
N = 3
arr[] = {1, 2, 4}
Output:
1 2 5
Explanation:
124+1 = 125, and so the Output
Example 2:

Input:
N = 3
arr[] = {9,9,9}
Output:
1 0 0 0
Explanation:
999+1 = 1000, and so the output
*
* */

public class PlusOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);


        System.out.println(plusOne(arr));
    }

    public  static ArrayList<Integer> plusOne(ArrayList<Integer> arr){
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i) < 9){
                arr.set(i,arr.get(i)+1);
                return arr;
            }
            else{
                arr.set(i,0);
            }
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.addAll(arr);
        return arr1;
    }

}
