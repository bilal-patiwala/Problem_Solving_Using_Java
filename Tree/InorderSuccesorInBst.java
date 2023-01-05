package Solving_Problems_using_java.Tree;

import java.util.ArrayList;

public class InorderSuccesorInBst {
    public static void main(String[] args) {
        BinaryTreeImplementation t = new BinaryTreeImplementation();
        BinaryTreeNode root = t.createTree();
        BinaryTreeNode x = new BinaryTreeNode(8);
        BinaryTreeNode node = inorderSuccessor(root,x);
        System.out.println(node.data);
    }
    private static BinaryTreeNode inorderSuccessor(BinaryTreeNode root, BinaryTreeNode x){
        ArrayList<Integer> l = new ArrayList<Integer>();
        inOrder(root,l);
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            if(x.data == l.get(i) && l.size()>i+1){
                return new BinaryTreeNode(l.get(i+1));
            }
        }
        return null;
    }
    private static void inOrder(BinaryTreeNode root, ArrayList<Integer> l){
        if(root!=null){
            inOrder(root.left,l);
            l.add(root.data);
            inOrder(root.right, l);
        }

    }
}
