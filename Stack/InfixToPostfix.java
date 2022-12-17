package Solving_Problems_using_java.Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "(a+b+c)/d";
        Stack<Character> stk = new Stack<>();
        int parenthesis = 4;
        int circumflex = 3;
        int mD = 2;
        int aS = 1;
        String result = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                stk.push(str.charAt(i));
                continue;
            }
            if((str.charAt(i) >= 'a' && str.charAt(i) <='z') || (str.charAt(i)>='A' && str.charAt(i) <= 'Z') ){
                result = result + str.charAt(i);
                continue;
            }
            else if(stk.isEmpty()){
                stk.push(str.charAt(i));
                continue;
            }
            while(str.charAt(i) == ')'){
                if(stk.peek()!='('){
                    result=result+stk.pop();
                }
                else {
                    stk.pop();
                    break;
                }
            }
            if(str.charAt(i) == '+'){
                while(stk.peek() == '+' ||stk.peek() == '-' || stk.peek() == '*' ||stk.peek() == '/'||stk.peek() == '^'){
                    result=result+stk.pop();
                    if(stk.isEmpty()){
                        break;
                    }
                }
                stk.push(str.charAt(i));
                continue;
            }
            else if(str.charAt(i) == '-'){
                while(stk.peek() == '-' ||stk.peek() == '+' || stk.peek() == '*' ||stk.peek() == '/'||stk.peek() == '^'){
                    result=result+stk.pop();
                    if(stk.isEmpty()){
                        break;
                    }
                }
                    stk.push(str.charAt(i));
                    continue;
            }
            else if(str.charAt(i) == '*'){
                while(stk.peek() == '*' ||stk.peek() == '/'||stk.peek() == '^'){
                    result=result+stk.pop();
                    if(stk.isEmpty()){
                        break;
                    }
                }
                    stk.push(str.charAt(i));
                    continue;
            }
            else if(str.charAt(i) == '/'){
                while(stk.peek() == '/' ||stk.peek() == '*'||stk.peek() == '^'){
                    result=result+stk.pop();
                    if(stk.isEmpty()){
                        break;
                    }
                }
                    stk.push(str.charAt(i));
                    continue;
            }
            else if(str.charAt(i) == '^'){
                stk.push(str.charAt(i));
            }
        }
        while (!stk.isEmpty()){
            result = result+stk.pop();
        }
        System.out.println(result);
    }
}
