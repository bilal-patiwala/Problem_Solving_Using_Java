package Solving_Problems_using_java;

import java.util.ArrayList;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {100,180,260,310,40,535,695};
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                l.add(new ArrayList<>());
                l.get(l.size()-1).add(i-1);
                l.get(l.size()-1).add(i);
            }
        }

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }

}
