package Solving_Problems_using_java.BitMasking;
/*
* Given a positive integer N, print count of set bits in it.

Example 1:

Input:
N = 6
Output:
2
Explanation:
Binary representation is '110'
So the count of the set bit is 2.
*
* */
public class NumberOf1Bits {
    public static void main(String[] args) {
        int num = 8;
        StringBuilder res = new StringBuilder();
        int count = 0;
        while(num != 0){
            res.append(num%2);
            num = num/2;
        }
        for(int i=res.length()-1;i>=0;i--){
            if(res.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
