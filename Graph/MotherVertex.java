package Solving_Problems_using_java.Graph;

import java.util.*;

public class MotherVertex {
    public static int count = 0;
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int v = 5;
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(0,2,adj);
        addEdge(0,3,adj);
        addEdge(2,1,adj);
        addEdge(1,0,adj);
        addEdge(3,4,adj);



        ArrayList<Integer> res = new ArrayList<>();
        int r = kosaRaju(v,adj);
        System.out.println(r);
//        for(int i=0; i<v; i++){
//            findMotherVertex(v,adj,i,res);
//        }

    }
    private static void addEdge(int src, int dest, ArrayList<ArrayList<Integer>> adj) {
        adj.get(src).add(dest);
    }

/*---------------------------- The below code work in O(E+V) complexity and use kosaraju algorithm methodology -----------------------------------*/

    private static int kosaRaju(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] isVisited = new boolean[v];
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<v; i++){
            if(isVisited[i] == false){
                dfs(i, stk, adj, isVisited);
            }
        }

        int ans = stk.pop();
        count = 0;
        isVisited = new boolean[v];
        dfs(ans,adj,isVisited);
        if(count == v){
            return ans;
        }
        else{
            return -1;
        }
    }

    private static void dfs(int node, Stack<Integer> stk, ArrayList<ArrayList<Integer>> adj, boolean[] isVisited){
        isVisited[node] = true;
        for(int l : adj.get(node)){
            if(isVisited[l] == false){
                dfs(l,stk,adj,isVisited);
            }
        }
        stk.push(node);
    }
    private static void dfs(int node, ArrayList<ArrayList<Integer>> transpose, boolean[] isVisited){
        isVisited[node] = true;
        count++;
        for(int l : transpose.get(node)){
            if(isVisited[l] == false){
                dfs(l,transpose,isVisited);
            }
        }
    }


/* --------------------------------------------- The below code will work in O(E(V+E)) complexity and uses BFS -----------------------------------------*/

//    private static ArrayList<Integer> findMotherVertex(int v, ArrayList<ArrayList<Integer>> adj, int i, ArrayList<Integer> res){
//        boolean[] isVisited = new boolean[v];
//        Queue<Integer> q = new LinkedList<>();
//
//        q.add(i);
//        while(!q.isEmpty()){
//            int r = q.remove();
//            if(isVisited[r] == false){
//                isVisited[r] = true;
//                for(int l : adj.get(r)){
//                    q.add(l);
//                }
//            }
//            if(q.isEmpty() && areAllTrue(isVisited)){
//                res.add(i);
//            }
//        }
//        return res;
//    }
//    public static boolean areAllTrue(boolean[] array)
//    {
//        for(boolean b : array) if(!b) return false;
//        return true;
//    }

}
