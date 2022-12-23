package Solving_Problems_using_java.Stack;


import java.util.Stack;

public class ValidSubstring {
    public static void main(String[] args) {
        String str = "))(()((())";
        int length = 0;
        int maxLen = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                stk.push(i);
            }
            else if(str.charAt(i)==')'){
                stk.pop();
                if(!stk.isEmpty()){
                    length = Math.max(length, i-stk.peek());
                }
                else {
                    stk.push(i);
                }
            }
        }
        System.out.println(length);
    }
}
