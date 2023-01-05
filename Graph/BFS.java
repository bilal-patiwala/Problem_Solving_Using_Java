package Solving_Problems_using_java.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int v = 5;
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(0,1,adj);
        addEdge(0,2,adj);
        addEdge(0,3,adj);
        addEdge(2,4,adj);
        ArrayList<Integer> res = bfs(adj);
        System.out.println(res);
    }

    private static void addEdge(int src, int dest, ArrayList<ArrayList<Integer>> adj) {
        adj.get(src).add(dest);
    }

    private static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        q.add(0);
        boolean[] visited = new boolean[adj.size()];
        while(!q.isEmpty()){
            int r = q.remove();
            if(visited[r]==false){
                visited[r]=true;
                for(int l : adj.get(r)){
                    q.add(l);
                }
                res.add(r);
            }
        }
        return res;
    }

}
