package Solving_Problems_using_java.Queue;

import java.util.*;

public class FirstNegativeInteger {
    public static void main(String[] args) {
        long[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        ArrayList<Long> a = new ArrayList<>();

        for(int i=0;i<=arr.length-k;i++){
            long min = 0;
            if(arr[i]<0){
                a.add(arr[i]);
                continue;
            }
            for(int j=1;j<k;j++){
                if(arr[i+j]<0){
                    min = arr[i+j];
                    break;
                }
            }
            a.add(min);
        }
        long[] res = new long[a.size()];
        for(int i=0;i< res.length;i++){
            res[i] = a.get(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
