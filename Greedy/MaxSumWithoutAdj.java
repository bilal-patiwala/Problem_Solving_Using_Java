package Solving_Problems_using_java.Greedy;

public class MaxSumWithoutAdj {
    public static void main(String[] args) {
        int[] arr = {5,5,10,100,10,5};
        if(arr.length == 0){
            System.out.println(0);
        }
        else if(arr.length == 1){
            System.out.println(arr[0]);
        }
        else if(arr.length == 2){
            System.out.println(Math.max(arr[0], arr[1]));
        }
        int val1 = arr[0];
        int val2 = Math.max(arr[0], arr[1]);
        int max_val = 0;
        for(int i=2;i<arr.length;i++){
            max_val = Math.max(val1 + arr[i], val2);
            val1 = val2;
            val2 = max_val;
        }
        System.out.println(max_val);
    }
}
