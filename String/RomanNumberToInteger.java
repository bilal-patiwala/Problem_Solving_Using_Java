package Solving_Problems_using_java.String;
/*
* Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III
Output: 3
*
* */
public class RomanNumberToInteger {
    public static void main(String[] args) {
        String num = "MMMCMXCIX";
        int i =0 ;
        int sum = 0;
        int[] res = new int[num.length()+1];
        while(i < num.length()){
            if(num.charAt(i) == 'I'){
                res[i] = 1;
                i++;
            }
            else if(num.charAt(i) == 'V'){
                res[i] = 5;
                i++;
            }
            else if(num.charAt(i) == 'X'){
                res[i] = 10;
                i++;
            }
            else if(num.charAt(i) == 'L'){
                res[i] = 50;
                i++;
            }
            else if(num.charAt(i) == 'C'){
                res[i] = 100;
                i++;
            }
            else if(num.charAt(i) == 'D'){
                res[i] = 500;
                i++;
            }
            else if(num.charAt(i) == 'M'){
                res[i] = 1000;
                i++;
            }
        }
        int j=0;
        while(j<res.length-1){
            if(res[j] < res[j+1]){
                sum = sum + (res[j+1] - res[j]);
                j+=2;
            }
            else{
                sum = sum + res[j];
                j++;
            }
        }
        System.out.println(sum);
    }
}
