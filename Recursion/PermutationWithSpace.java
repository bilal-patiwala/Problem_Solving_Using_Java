package Solving_Problems_using_java.Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationWithSpace {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        String s = "ABC";
        permutation(l,s.substring(1,s.length()),""+s.charAt(0));
        System.out.println(l);
    }

    private static void permutation(ArrayList<String> l, String s, String prefix) {
        if(s.length() == 0){
            l.add(prefix);
        }
        else{
            permutation(l,s.substring(1,s.length()),prefix+" "+s.charAt(0));
            permutation(l,s.substring(1,s.length()),prefix+s.charAt(0));
        }
    }
}
