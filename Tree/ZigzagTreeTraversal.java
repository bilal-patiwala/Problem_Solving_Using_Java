package Solving_Problems_using_java.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigzagTreeTraversal {
    static int count = 0;
    public static void main(String[] args) {
        BinaryTreeImplementation t = new BinaryTreeImplementation();
        BinaryTreeNode root = t.createTree();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        ArrayList<Integer> l = new ArrayList<>();
        q.add(root);
        q.add(null);
        zigzag(l,q);
        System.out.println(l);
    }

    public static void zigzag(ArrayList<Integer> l, Queue<BinaryTreeNode> q){
        ArrayList<Integer> curr = new ArrayList<>();
        boolean leftToRight = true;
        while(!q.isEmpty()){
            BinaryTreeNode node = q.remove();
            if(node != null){
                curr.add(node.data);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }else{
                if(leftToRight){
                    ArrayList<Integer> temp = new ArrayList<>(curr);
                    l.addAll(temp);
                    curr.clear();
                }
                else{
                    Stack<Integer> stk = new Stack<>();
                    stk.addAll(curr);
                    ArrayList<Integer> temp = new ArrayList<>();
                    while(!stk.isEmpty()){
                        temp.add(stk.pop());
                    }
                    l.addAll(temp);
                    curr.clear();
                }
                if(!q.isEmpty()){
                    q.add(null);
                    leftToRight = !leftToRight;
                }
            }
        }
    }

}
