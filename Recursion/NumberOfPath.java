package Solving_Problems_using_java.Recursion;

public class NumberOfPath {
    public static long count = 0;
    public static void main(String[] args) {
        int m = 5;
        int n = 1;
        noOfPaths(1,1,m,n);
        System.out.println(count);
    }

    private static void noOfPaths(int m, int n, int row, int col) {
        if(m==row && n==col){
            count++;
        }
        if(n < col){
            noOfPaths(m,n+1,row,col);
        }
        if(m<row){
            noOfPaths(m+1,n,row,col);
        }

        return;
    }
}
