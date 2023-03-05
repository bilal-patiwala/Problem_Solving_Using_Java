package Solving_Problems_using_java.Math;

public class Combination {
    public static void main(String[] args) {
        int n = 40;
        int r = 39;
        int[][] arr = new int[n+1][r+1];
        int res = fact(n,r,arr);
        System.out.println(res);
    }

    private static int fact(int n, int r,int[][] arr) {
        if(arr[n][r] > 0){
            return arr[n][r];
        }
        if(r>n){
            return 0;
        }
        if(r==0 || r==n){
            return 1;
        }
        arr[n][r] = (fact(n-1,r-1,arr)+fact(n-1,r,arr))%1000000007;
        return arr[n][r];
    }
}
