package Solving_Problems_using_java.Tree;

public class ArrayToBst {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int i = 0;
        int n = arr.length-1;

        BinaryTreeNode root = createBsT(i,n,arr);
        preOrder(root);
    }
    private static BinaryTreeNode createBsT(int s,int e, int[] arr){
        if (s > e){
            return null;
        }
        int midpoint = s + (e-s)/2;
        BinaryTreeNode root = new BinaryTreeNode(arr[midpoint]);
        root.left = createBsT(s,midpoint-1,arr);
        root.right = createBsT(midpoint+1,e,arr);
        return root;
    }
    private static void preOrder(BinaryTreeNode root){
        if(root != null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);;
        }
    }
}
