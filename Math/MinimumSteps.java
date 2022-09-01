package Solving_Problems_using_java.Math;

//Problem Statement:-

//Given an array arr[] containing N integers. In one step, any element of the array can either be increased or decreased by one. Find minimum steps required such that the product of the array elements becomes 1.
//
//
//
//        Example 1:
//
//        Input:
//        N = 3
//        arr[] = {-2, 4, 0}
//        Output:
//        5
//        Explanation:
//        We can change -2 to -1, 0 to -1 and 4 to 1.
//        So, a total of 5 steps are required
//        to update the elements such that
//        the product of the final array is 1.

public class MinimumSteps {
    public static void main(String[] args) {
        int[] arr = {-1};
        int n = arr.length;
        System.out.println(makeProductOne(arr,n));
    }
    static int makeProductOne(int[] arr, int N) {
        // code here
        int[] count = new int[N];
        int step = 0;
        int i = 0;
        do{
            if(arr[i]<0 && arr[i] == -1){
                count[i] =arr[i];
            }
            else if(arr[i]<0){
                arr[i] = arr[i] + 1;
                count[i] = arr[i];
                step = step + 1;
            }
            else if(arr[i]>0 && arr[i] == 1){
                count[i] = arr[i];
            }
            else if(arr[i]>0){
                arr[i] = arr[i] - 1;
                count[i] = arr[i];
                step++;
            }
            else if(arr[i] == 0 && N==1){
                arr[i] = arr[i] + 1;
                count[i] = arr[i];
                step++;
            }
            else {
                arr[i] = arr[i] - 1;
                count[i] = arr[i];
                step++;
            }
            if(count[i] == 1 || count[i] == -1){
                i++;
            }
            if(i==N){
                break;
            }
        }while(count[i] != 1 || count[i] != -1);

        int product = 1;
        for(int j=0;j<N;j++){
            product = count[j] * product;
        }
        if(product == 1){
            return step;
        }
        else{
            step = step + 2;
        }
        return step;

    }
}
