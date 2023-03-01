package Solving_Problems_using_java.DynamicProgramming;

import java.util.Arrays;

public class GoldMineProblem {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
        int[][] mine = {
                {1, 3, 1, 5},
                {2, 2, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 1, 2}
        };
        for(int i=0;i<n;i++){
            getMaxGold(i,0,mine,arr);
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int max = 0;
        for(int i=0;i<n;i++){
            if(max < arr[i][0]){
                max = arr[i][0];
            }
        }
        System.out.println(max);

    }

    private static int getMaxGold(int n, int m, int[][] mine, int[][] arr) {
        if(arr[n][m] >= 0){
            return arr[n][m];
        }
        if(m == arr[n].length-1){
            arr[n][m] = mine[n][m];
            return mine[n][m];
        }
        if(n==0){
            arr[n][m] = Math.max(getMaxGold(n,m+1,mine,arr),getMaxGold(n+1,m+1,mine,arr)) + mine[n][m];
        }
        else if(n==arr.length-1){
            arr[n][m] = Math.max(getMaxGold(n,m+1,mine,arr),getMaxGold(n-1,m+1,mine,arr)) + mine[n][m];
        }
        else{
            arr[n][m] = Math.max(getMaxGold(n+1,m+1,mine,arr),Math.max(getMaxGold(n,m+1,mine,arr),getMaxGold(n-1,m+1,mine,arr))) + mine[n][m];
        }
        return arr[n][m];
    }
}
