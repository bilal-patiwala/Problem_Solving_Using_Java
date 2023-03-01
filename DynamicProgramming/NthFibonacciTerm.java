package Solving_Problems_using_java.DynamicProgramming;

public class NthFibonacciTerm {
    public static void main(String[] args) {
        long n = 9;
        long[] arr = new long[(int) n + 1];
        long ans = getNthTerm(n, arr);
        System.out.println(ans);
    }

    private static long getNthTerm(long n, long[] arr) {
        if(arr[(int) n] != 0){
            return arr[(int) n]%1000000007;
        }
        if(n==1 || n==2){
            return 1;
        }
        arr[(int) n] = getNthTerm(n-2,arr) + getNthTerm(n-1,arr);
        return arr[(int) n]%1000000007;
    }
}
