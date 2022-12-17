package Solving_Problems_using_java.Stack;

import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String str = "abbaca";
        Stack<Character> stk = new Stack<>();
        int i = 1;
        stk.push(str.charAt(0));
        while(i != str.length()){
            if(stk.isEmpty()){
                stk.push(str.charAt(i));
                i++;
                continue;
            }
            if(str.charAt(i) == stk.peek()){
                stk.pop();
            }
            else{
                stk.push(str.charAt(i));
            }
            i++;
        }
        StringBuilder res = new StringBuilder();
        char ch = stk.pop();
        while(!stk.isEmpty()){
            if(stk.peek() != ch){
                res.append(ch);
            }
            else {
                stk.pop();
            }
            ch = stk.pop();
        }
        res.append(ch);
        System.out.println(res.reverse().toString());
    }
}
