package Solving_Problems_using_java.Matrix;

import java.util.ArrayList;

/*
* You are given a matrix of dimensions n x m. The task is to perform boundary traversal on the matrix in a clockwise manner.

Example 1:

Input:
n = 4, m = 4
matrix[][] = {{1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12},
         {13, 14, 15,16}}
Output: 1 2 3 4 8 12 16 15 14 13 9 5
Explanation:
The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is:
1 2 3 4 8 12 16 15 14 13 9 5
*
Example 2:

Input:
n = 3, m = 4
matrrix[][] = {{12, 11, 10, 9},
         {8, 7, 6, 5},
         {4, 3, 2, 1}}
Output: 12 11 10 9 5 1 2 3 4 8
* */

public class BoundaryTraversalOfMatrix {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
        int n = matrix.length;
        int m = matrix[0].length;
        if (m == 1 || n==1) {
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr.add(matrix[i][j]);
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==0){
                        arr.add(matrix[i][j]);
                    }
                    if(i>0 && i<n-1 && j == m-1){
                        arr.add(matrix[i][j]);
                    }
                }
            }
            for(int i=n-1; i>=0; i--){
                for(int j=m-1;j>=0;j--){
                    if(i > 0 && i<n-1 && j==0){
                        arr.add(matrix[i][j]);
                    }
                    if(i == n-1){
                        arr.add(matrix[i][j]);
                    }
                }
            }
        }

        System.out.println(arr);
    }
}
