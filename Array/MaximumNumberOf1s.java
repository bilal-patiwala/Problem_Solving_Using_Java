package Solving_Problems_using_java.Array;

public class MaximumNumberOf1s {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {0, 0, 0, 1};
        int m = 3;
        int max = 0;
        int j = 0;
        int count = 0;
        int z = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                j++;
            }
            while(j>m){
                z++;
                if(arr[z] == 0){
                    j--;
                }

            }

            count = i-z;
            if(count > max){
                max = count;
            }

        }
        System.out.println(max);
    }
}
