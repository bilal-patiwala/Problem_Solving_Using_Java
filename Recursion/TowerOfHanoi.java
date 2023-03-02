package Solving_Problems_using_java.Recursion;

public class TowerOfHanoi {
    public static long step = 0;

    public static void main(String[] args) {
        int disc = 3;
        toh(disc,1,2,3);
        System.out.println(step);
    }

    private static void toh(int disc, int A, int B, int C) {
        if(disc>0){
            toh(disc-1,A,C,B);
            step++;
            toh(disc-1,B,A,C);
        }
    }
}
