package Solving_Problems_using_java.Heap;

import java.util.PriorityQueue;

// https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

public class MinimumCostOfRopes {
    public static void main(String[] args) {
        long[] arr = {4, 3, 2, 6};
        PriorityQueue<Long> initQ = new PriorityQueue<>();
        PriorityQueue<Long> finalQ = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            initQ.add(arr[i]);
        }


        while(initQ.size()>1){
            long num1 = initQ.remove();
            long num2 = initQ.remove();
            long temp = num1 + num2;
            finalQ.add(temp);
            initQ.add(temp);
        }
        long minimumCost = 0;
        while(finalQ.size()!=0){
            minimumCost = minimumCost + finalQ.remove();
        }
        System.out.println(minimumCost);
    }
}
