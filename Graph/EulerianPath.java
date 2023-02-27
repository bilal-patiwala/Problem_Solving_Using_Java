package Solving_Problems_using_java.Graph;

import java.util.Stack;

public class EulerianPath {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0}
        };
        Stack<Integer> stk = new Stack<>();
        for(int[] a: graph){
            int count = 0;
            for(int i=0;i<a.length;i++){
                if(a[i] == 1){
                    count++;
                }
            }
            stk.push(count);
        }
        int res = 0;
        while(!stk.isEmpty()){
            int r = stk.pop();
            if(r%2!=0){
                res++;
            }
        }
        if(res == 2){
            System.out.println(1);
        }
        else
            System.out.println(0);
    }
}
