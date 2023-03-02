package Solving_Problems_using_java.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        String s = "SABHD";
        permutation(l,s,"");
        Collections.sort(l);
        System.out.println(l);
    }

    private static void permutation(ArrayList<String> l, String s, String prefix) {
        if(s.length() == 0){
            l.add(prefix);
        }
        else{
            for (int i=0;i<s.length();i++){
                permutation(l,s.substring(0,i) + s.substring(i+1,s.length()),prefix+s.charAt(i));
            }
        }
    }
}
