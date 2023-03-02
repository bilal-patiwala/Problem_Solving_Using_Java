package Solving_Problems_using_java.Recursion;

import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Long>> l = new ArrayList<>();
        int n = 74;
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }

        getNthRow(n-1,l);
        System.out.println(l.get(n-1));
    }

    private static void getNthRow(int n, ArrayList<ArrayList<Long>> l) {
        if(n==0){
            l.get(n).add(1L%1000000007);
        }
        else{
            getNthRow(n-1,l);
            for (int j=0;j<=n;j++){
                if(j==0 || j==n){
                    l.get(n).add(1L%1000000007);
                }
                else{
                    long sum = l.get(n-1).get(j)+l.get(n-1).get(j-1);
                    l.get(n).add((sum)%1000000007);
                }
            }
        }
    }
}
