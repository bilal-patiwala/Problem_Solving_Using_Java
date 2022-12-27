package Solving_Problems_using_java.Heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class AddingArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,16,10,5,6};
        int k = 45;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length;i++){
            pq.add(arr[i]);
        }

        int op = 0;
        while(pq.size()>=2 && pq.peek()<k){
            op++;
            int num1 = pq.remove();
            int num2 = pq.remove();
            pq.add(num1 + num2);
        }
        if(pq.size()==1 && pq.peek()<k){
            System.out.println(-1);
        }
        else{
            System.out.println(op);
        }

    }
}
