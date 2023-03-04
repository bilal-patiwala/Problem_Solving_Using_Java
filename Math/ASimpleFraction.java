package Solving_Problems_using_java.Math;

import java.util.HashMap;

public class ASimpleFraction {
    public static void main(String[] args) {
        System.out.println(fractionalToDecimal(18,19));
    }
    private static String fractionalToDecimal(int numerator, int denominator){
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int remainder = numerator%denominator;
        int qoutient = numerator/denominator;
        if(remainder == 0){
            return ""+qoutient;
        }
        res.append(qoutient);
        res.append(".");
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(remainder,0);
        remainder=remainder*10;
        int i=1;
        while(remainder>0){
            int d = remainder/denominator;
            int r = remainder%denominator;
            temp.append(d);

            if(h.containsKey(r)){
                int pos = h.get(r);
                temp.insert(pos,"(");
                temp.append(")");
                break;
            }
            else{
                h.put(r,i);
                remainder = r*10;
                i++;
            }
        }


        return res.append(temp.toString()).toString();

    }
}
