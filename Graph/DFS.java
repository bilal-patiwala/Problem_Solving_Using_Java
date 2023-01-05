package Solving_Problems_using_java.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int v = 5;
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(0,2,adj);
        addEdge(0,3,adj);
        addEdge(0,1,adj);
        addEdge(2,4,adj);
        ArrayList<Integer> res = dfs(adj);
        System.out.println(res);
    }

    private static void addEdge(int src, int dest, ArrayList<ArrayList<Integer>> adj) {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    private static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> stk = new Stack<>();
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                dfsTraversal(i,adj,visited,res);
            }
        }
        return res;
    }

    private static void dfsTraversal(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> res) {
        visited[v] = true;
        res.add(v);
        for(int neighbor : adj.get(v)){
            while(!visited[neighbor]){
                visited[neighbor] = true;
                dfsTraversal(neighbor,adj,visited,res);
            }
        }
    }
}
