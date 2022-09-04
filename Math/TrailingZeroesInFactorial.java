package Solving_Problems_using_java.Math;

//Problem statement

//For an integer N find the number of trailing zeroes in N!.
//
//        Example 1:
//
//        Input:
//        N = 5
//        Output:
//        1
//        Explanation:
//        5! = 120 so the number of trailing zero is 1.


public class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(384));
    }
    static int trailingZeroes(int N){
        // Write your code here
        int count = 0;
        int i=5;
        int j = 1;
        while(N/i>0){
            count+=N/i;
            i = i * 5;
        }
        return count;
    }
}
