package Solving_Problems_using_java.Math;

public class CountOfSumOfConsecutive {
    public static void main(String[] args) {
        int num = 1;
        int ans;
        ans = getCount(num);
        System.out.println(ans);
    }

    private static int getCount(int n) {
        int k=1;
        int count = 0;
        while(2*n > ((k*(k-1)))){
            int x = (n - ((k*(k-1))/2));
            if(x%k == 0){
                count++;
            }
            k++;
        }
        return count;
    }
}
