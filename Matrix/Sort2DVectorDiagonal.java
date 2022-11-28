package Solving_Problems_using_java.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
* Given an NxM 2D matrix, rearrange such that
Each diagonal in the lower left triangle of the rectangular grid is sorted in ascending order.
Each diagonal in the upper right triangle of the rectangular grid is sorted in descending order.
The major diagonal in the grid starting from the top-left corner is not rearranged.


Example 1:

Input:
N = 4, M = 5
matrix = {{3 6 3 8 2},
          {4 1 9 5 9},
          {5 7 2 4 8},
          {8 3 1 7 6}}
Output:
3 9 8 9 2
1 1 6 5 8
3 4 2 6 3
8 5 7 7 4

* */

public class Sort2DVectorDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {3,6,3,8,2},
                {4,1,9,5,9},
                {5,7,2,4,8},
                {8,3,1,7,6}
        };
        int n = matrix.length;
        int m = matrix[0].length;

        diagonalSort(matrix,n,m);
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void diagonalSort(int[][] matrix, int n, int m) {
        for(int col = 1;col<m;col++){
            sortDesc(matrix,n,m,0,col);
        }
        for(int row=1;row<n;row++){
            sortAsc(matrix,n,m,row,0);
        }
    }

    private static void sortAsc(int[][] matrix, int n, int m, int row, int col) {
        ArrayList<Integer> list = new ArrayList<>();
        int r = row;
        int c = col;
        while(r<n && c<m){
            list.add(matrix[r][c]);
            r++;
            c++;
        }
        Collections.sort(list);
        int index=0;
        while(row<n && col<m){
            matrix[row][col] = list.get(index++);
            row++;
            col++;
        }
    }

    private static void sortDesc(int[][] matrix, int n, int m, int row, int col) {
        ArrayList<Integer> list = new ArrayList<>();
        int r = row;
        int c = col;
        while(r<n && c<m){
            list.add(matrix[r][c]);
            r++;
            c++;
        }

        Collections.sort(list,Collections.reverseOrder());
        int index = 0;
        while(row < n && col < m){
            matrix[row][col] = list.get(index++);
            row++;
            col++;
        }
    }


}
