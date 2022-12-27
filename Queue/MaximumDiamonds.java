package Solving_Problems_using_java.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumDiamonds {
    public static void main(String[] args) {
        int[] arr = {2,1,7,4,2};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int sum = 0;
        for(int i=0;i<k;i++){
            int temp = pq.remove();
            sum = sum + temp;
            pq.add(temp/2);
        }
        System.out.println(sum);
    }
}
