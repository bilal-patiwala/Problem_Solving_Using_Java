package Solving_Problems_using_java.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CountThePath {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int v = 5;
        int s = 0;
        int d = 2;
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(0,1,adj);
        addEdge(1,2,adj);
        addEdge(0,3,adj);
        addEdge(3,2,adj);
        int res = possiblePath(v,s,d,adj);
        System.out.println(adj.size());
        System.out.println(res);
    }

    private static int possiblePath(int v, int s, int d, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        int count = 0;
        while(!q.isEmpty()){
            int r = q.remove();
            if(r == d){
                count++;
                continue;
            }
            for(int l: adj.get(r)){
                q.add(l);
            }
        }
        return count;
        /*------- for adjacency matrix --------*/
//        Queue<Integer> q = new LinkedList<>();
//        q.add(s);
//        int count = 0;
//        while(!q.isEmpty()){
//            int r = q.remove();
//            if(r == d){
//                count++;
//                continue;
//            }
//            for(int[] x: a){
//                if(x[0] == r){
//                    q.add(x[1]);
//                }
//            }
//        }
//        return count;
    }

    private static void addEdge(int src, int dest, ArrayList<ArrayList<Integer>> adj) {
        adj.get(src).add(dest);
    }
}
