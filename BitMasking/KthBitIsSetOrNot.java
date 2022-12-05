package Solving_Problems_using_java.BitMasking;

/*
* Given a number N and a bit number K, check if Kth bit of N is set or not. A bit is called set if it is 1. Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.

Example 1:

Input: N = 4, K = 0
Output: No
Explanation: Binary representation of 4 is 100,
in which 0th bit from LSB is not set.
So, return false.
Example 2:

Input: N = 4, K = 2
Output: Yes
Explanation: Binary representation of 4 is 100,
in which 2nd bit from LSB is set.
So, return true.
* */

public class KthBitIsSetOrNot {
    public static void main(String[] args) {
        int num = 500;
        StringBuilder str = new StringBuilder();
        int k = 3;
        while (num != 0){
            str.append(num%2);
            num = num/2;
        }
        if(str.charAt(k) == '1'){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
