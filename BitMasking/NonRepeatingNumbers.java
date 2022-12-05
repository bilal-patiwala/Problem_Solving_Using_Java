package Solving_Problems_using_java.BitMasking;

import java.util.Arrays;
/*
* Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.


Example 1:

Input:
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4
Explanation:
3 and 4 occur exactly once.
Example 2:

Input:
N = 1
arr[] = {2, 1, 3, 2}
Output:
1 3
Explanation:
1 3 occur exactly once.
* */
public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2};
        Arrays.sort(arr);
        int[] count = new int[arr[arr.length-1]+1];
        int[] res = new int[2];
        int j=0;
        for(int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i< count.length;i++){
            if(count[i] == 1){
                res[j++] = i;
            }
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
