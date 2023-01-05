package Solving_Problems_using_java.Graph;

import java.util.ArrayList;

public class PrintAdjacencyList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int v = 5;
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        list.get(0).add(4);
        list.get(1).add(0);
        list.get(1).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(2).add(1);
        list.get(2).add(3);
        list.get(3).add(1);
        list.get(3).add(2);
        list.get(3).add(4);
        list.get(4).add(0);
        list.get(4).add(1);
        list.get(4).add(3);

        printAdjancencyList( list, v);
    }

    private static void printAdjancencyList(ArrayList<ArrayList<Integer>> list, int v) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<v;i++){
            res.add(new ArrayList<>());
            for(int j=0;j<list.get(i).size();j++){
                res.get(i).add(list.get(i).get(j));
            }
        }
        for(int i=0;i<v;i++){
            System.out.print(i);
            for(int j=0;j<res.get(i).size();j++){
                System.out.print( "-->" + res.get(i).get(j) );
            }
            System.out.println();
        }
    }
    // for gfg problem
    public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> list) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<V;i++){
            res.add(new ArrayList<>());
            res.get(i).add(i);
            for(int j=0;j<list.get(i).size();j++){
                res.get(i).add(list.get(i).get(j));
            }
        }

        return res;
    }
}
