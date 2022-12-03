package Solving_Problems_using_java.String;

import java.util.Arrays;
/*
* iven a array of N strings, find the longest common prefix among all strings present in the array.


Example 1:

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.
* */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"abcdefg", "abcdefghij", "abcdefgh", "abcd", "ab", "abc"};
        int len = Arrays.stream(arr).map(String::length).max(Integer::compareTo).get();
        String res = "";
        int i =0;
        int count = 0;

        while(i< arr.length-1){
            int cur = arr[i].length();
            int next = arr[i+1].length();

            int min = Math.min(cur, next);
            int j=0;
            String temp = "";
            while(j<min){
                if(arr[i].charAt(j) == arr[i+1].charAt(j)){
                    temp = temp + arr[i].charAt(j);
                    j++;
                }
                else{
                    break;
                }
            }
            if(temp == ""){
                count = 0;
            }
            if(temp.length() <= res.length()){
                res = temp;
                count++;
                i++;
            }
            else if(res==""){
                res = temp;
                count++;
                i++;
            }
            else{
                count++;
                i++;
            }
        }
        if(res != "" && count == arr.length-1 ){
            System.out.println(res);
        }
        else{
            System.out.println(-1);
        }
    }
}
