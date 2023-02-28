package Solving_Problems_using_java.Greedy;

public class LargestNumberWithGivenSum {
    public static void main(String[] args) {
        int sum = 29;
        int n = 5;
        String password = getPassword(n,sum);
        System.out.println(password);
    }

    private static String getPassword(int n, int sum) {
        if(n*9 < sum){
            return "-1";
        }
        int temp = sum;
        int num = 9;
        int i=0;
        String pass = "";
        int total = 0;
        while(i<n){
            if(sum >= 9){
                sum = sum - num;
                pass = pass + num;
                total = total + num;
                i++;
            }
            else if(sum < 9){
                num = sum;
                sum = sum - num;
                pass = pass + num;
                total = total + num;
                i++;
            }
        }
        if(total == temp){
            return pass;
        }
        return "-1";
    }
}
