package Solving_Problems_using_java.Matrix;

/*
* Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. The task is to find whether element X is present in the matrix or not.


Example 1:

Input:
N = 3, M = 3
mat[][] = 3 30 38
         44 52 54
         57 60 69
X = 62
Output:
0
Explanation:
62 is not present in the
matrix, so output is 0
* */

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,30,80},
                {44,52,54},
                {57,60,69}
        };

        System.out.println(search(matrix,62));

    }
    public static int search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return 1;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else if(matrix[row][col] < target){
                row++;
            }
        }
        return 0;
    }
}
