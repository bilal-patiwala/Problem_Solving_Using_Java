package Solving_Problems_using_java.Searching;

import java.util.ArrayList;
/*
* Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given array.

Note: If the element is not present in the array return {-1,-1} as pair.



Example 1:

Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.
*
*
* */
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class LeftMostAndRightMostIndex {
    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        long x = 10;
        pair p = index(arr,x);
        System.out.println(p.first + " " + p.second);

    }
    public static pair index(long[] arr, long x){
        ArrayList<Long> a = new ArrayList<>();
        for(long i=0;i<arr.length;i++){
            if(x == arr[(int) i]){
                a.add(i);
            }
        }
        if(a.size() == 0){
            return new pair(-1,-1);
        }
        else{
            return new pair(a.get(0),a.get(a.size()-1));
        }
    }
}
