package Solving_Problems_using_java.BitMasking;

/*
* Given a number N. Find the length of the longest consecutive 1s in its binary representation.

Example 1:

Input: N = 14
Output: 3
Explanation:
Binary representation of 14 is
1110, in which 111 is the longest
consecutive set bits of length is 3.
Example 2:

Input: N = 222
Output: 4
Explanation:
Binary representation of 222 is
11011110, in which 1111 is the
longest consecutive set bits of length 4.

* */

public class LongestConsecutive1s {
    public static void main(String[] args) {
        int num = 30;
        StringBuilder str = new StringBuilder();
        while (num != 0){
            str.append(num%2);
            num = num/2;
        }
        int count = 0;
        str.reverse();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
            if(str.charAt(i) == '0'){
                if(max < count){
                    max = count;
                }
                count = 0;
            }
        }
        if(max < count){
            max = count;
        }
        System.out.println(max);
    }
}
