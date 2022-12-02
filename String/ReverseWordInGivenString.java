package Solving_Problems_using_java.String;
/*
* Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
*
* */
public class ReverseWordInGivenString {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        int len = S.length();
        StringBuilder fStr = new StringBuilder();
        String res = "";
        for(int i=len-1;i>=0;i--){
            if(S.charAt(i) == '.'){
                fStr.reverse();
                fStr.append(S.charAt(i));
                res = res + fStr;
                fStr = new StringBuilder();
            }
            else{
                fStr.append(S.charAt(i));
            }
        }
        fStr.reverse();
        res = res + fStr;
        System.out.println(res);
    }
}
