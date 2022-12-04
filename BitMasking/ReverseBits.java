package Solving_Problems_using_java.BitMasking;
/*
* Given a non-negative integer n. Reverse the bits of n and print the number obtained after reversing the bits.
Note:  The actual binary representation of the number is being considered for reversing the bits, no leading 0’s are being considered.

Example 1:
Input :
N = 11
Output:
13
Explanation:
(11)10 = (1011)2.
After reversing the bits we get:
(1101)2 = (13)10.
*
* */
public class ReverseBits {
    public static void main(String[] args) {
        int num = 10000000;
        StringBuilder res = new StringBuilder();
        int sum = 0;
        while(num != 0){
            res.append(num%2);
            num = num/2;
        }
        for(int i=res.length()-1;i>=0;i--){
            if(res.charAt(i) == '1'){
                sum = (int) (sum + Math.pow(2,res.length()-1-i));
            }
        }
        System.out.println(sum);
    }
}
