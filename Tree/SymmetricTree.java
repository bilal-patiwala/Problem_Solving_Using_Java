package Solving_Problems_using_java.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    public BinaryTreeNode(int data){
        this.data = data;
    }
}

class BinaryTreeImplementation{
    Scanner sc = new Scanner(System.in);
    public BinaryTreeNode createTree(){
        BinaryTreeNode root = null;
        System.out.print("enter data: ");
        int data = sc.nextInt();
        if(data == -1){
            return  null;
        }
        root = new BinaryTreeNode(data);
        System.out.println("Enter data in left child " + root.data);
        root.left = createTree();
        System.out.println("enter data in right child " + root.data);
        root.right = createTree();
        return root;
    }
    public void inOrder(BinaryTreeNode root, ArrayList<Integer> a){
        if(root != null){
            inOrder(root.left,a);
            a.add(root.data);
            inOrder(root.right,a);
        }
    }
    public void preOrder(BinaryTreeNode root, ArrayList<Integer> a){
        if(root != null){
            a.add(root.data);
            preOrder(root.left, a);
            preOrder(root.right, a);
        }
    }
    public void postOrder(BinaryTreeNode root, ArrayList<Integer> a){
        if(root != null){
            postOrder(root.left,a);
            postOrder(root.right,a);
            a.add(root.data);
        }
    }
    public int maxElement(BinaryTreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int leftMax = maxElement(root.left);
        int rightMax = maxElement(root.right);

        if(leftMax > result){
            result = leftMax;
        }
        if(rightMax > result){
            result = rightMax;
        }
        return result;

    }
    public boolean isPresent(BinaryTreeNode root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        return isPresent(root.left,data)|| isPresent(root.right,data);
    }

    public void insert(BinaryTreeNode root, int data){
        if(root == null) {
            root = new BinaryTreeNode(data);
        }
        if(root.data >= data){
            if(root.left == null){
                root = new BinaryTreeNode(data);
            }
            else{
                insert(root.left,data);
            }
        }
        else{
            if(root.right == null){
                root = new BinaryTreeNode(data);
            }
            else{
                insert(root.right,data);
            }
        }
    }
}

public class SymmetricTree {
    public static void main(String[] args) {
        BinaryTreeImplementation t = new BinaryTreeImplementation();
        BinaryTreeNode root = t.createTree();
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(BinaryTreeNode root) {
        return isMirror(root, root);
    }
    public static boolean isMirror(BinaryTreeNode root1, BinaryTreeNode root2) {
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        return (root1.data == root2.data) && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }
}


