package Solving_Problems_using_java.DynamicProgramming;

public class CountWaysToReachNthStair {
    public static void main(String[] args) {
        int n = 84;
        int[] arr = new int[n+1];
        int count = getCount(n, arr);
        System.out.println(count);
    }

    private static int getCount(int n, int[] arr) {
        if(arr[n] != 0){
            return arr[n]%1000000007;
        }
        if (n == 1) {
            arr[n] = 1;
            return 1;
        }
        if(n == 2){
            arr[n] = 2;
            return 2;
        }
        arr[n] = getCount(n-2, arr) + getCount(n-1, arr);
        return arr[n]%1000000007;
    }

}
