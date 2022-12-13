package Solving_Problems_using_java.Stack;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "{}(){}[";
        Stack<Character> stk = new Stack<Character>();
        stk.push(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(stk.isEmpty()){
                stk.push(str.charAt(i));
                continue;
            }
            if(stk.peek() == '{' && str.charAt(i) == '}'){
                stk.pop();
            }
            else if(stk.peek() == '(' && str.charAt(i) == ')'){
                stk.pop();
            }
            else if(stk.peek() == '[' && str.charAt(i) == ']'){
                stk.pop();
            }
            else{
                stk.push(str.charAt(i));
            }
        }
        if(stk.isEmpty()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
